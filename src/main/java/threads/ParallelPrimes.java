package threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ParallelPrimes {

    public static void main() throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(16);
        List<Callable<List<Integer>>> callables = new ArrayList<>();
        List<Callable<List<Integer>>> callablesSlow = new ArrayList<>();

        for(int i=0; i<10000; i++){
            callables.add(new PrimeEngine(i*1000, (i+1)*1000));
            callablesSlow.add(new PrimeEngineSlow(i*1000, (i+1)*1000));

        }
        long start = System.nanoTime();
        List<Future<List<Integer>>> futures = executor.invokeAll(callables);

        for(Future<List<Integer>> future : futures){
            System.out.println(future.get());
        }
        long fast = System.nanoTime() - start;


        start = System.nanoTime();
        futures = executor.invokeAll(callablesSlow);

        for(Future<List<Integer>> future : futures){
            System.out.println(future.get());
        }
        System.out.printf("Total time fast: %d ms\n", TimeUnit.NANOSECONDS.toMillis(fast));
        System.out.printf("Total time slow: %d ms\n", TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - start));
        executor.shutdown();
    }

    public static class PrimeEngine implements Callable<List<Integer>> {
        int start;
        int end;

        public PrimeEngine(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public boolean isPrime(int number) {
            if (number <= 1 ) {
                return false;
            }
            if (number == 2 || number == 3 || number == 5 || number == 7){
                return true;
            }
            if(number % 2 == 0 || number % 3 == 0 || number % 5 == 0 || number % 7 == 0){
                return false;
            }
            for (int i = 6; i*i < number; i+=6) {
                if (number % (i+1) == 0 && number != (i+1)) {
                    return false;
                }
                if (number % (i-1) == 0 && number != (i-1)) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public List<Integer> call() {
            List<Integer> result = new ArrayList<>();
            for (int i = start; i < end; i++) {
                if (isPrime(i)) {
                    result.add(i);
                }
            }
            return result;
        }
    }

    public static class PrimeEngineSlow implements Callable<List<Integer>> {
        final int start;
        final int end;

        public PrimeEngineSlow(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public boolean isPrime(int number) {
            if (number <= 1) {
                return false;
            }
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }

        public List<Integer> call() {
            List<Integer> result = new ArrayList<>();
            for (int i = start; i < end; i++) {
                if (isPrime(i)) {
                    result.add(i);
                }
            }
            return result;
        }
    }
}
