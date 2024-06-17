package threads;

import java.util.concurrent.TimeUnit;
import java.util.random.RandomGenerator;

public class ThreadPool{
    public static final int MAX_TASKS = 16;

    public static void main() throws InterruptedException {
        Thread[] threadPool = new Thread[MAX_TASKS];
        RandomGenerator rnd = RandomGenerator.getDefault();

        for(int task=0; task < MAX_TASKS; task++){
            int taskNumber = task;
            threadPool[task] = new Thread(() -> {
               long start = System.nanoTime();
                System.out.printf("START thread=%s task=%d\n", Thread.currentThread().getName(), taskNumber);
                try{
                    Thread.sleep(rnd.nextInt(1000));
                }catch(InterruptedException ignored){

                }
                long stop = System.nanoTime();
                System.out.printf("STOP thread=%s task=%d t=%d ms\n", Thread.currentThread().getName(), taskNumber, TimeUnit.NANOSECONDS.toMillis(stop - start));
            });
        }

        for(Thread t : threadPool){
            t.start();
        }

        for(Thread t: threadPool){
            t.join();
        }
    }
}
