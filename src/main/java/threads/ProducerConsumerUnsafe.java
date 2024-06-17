package threads;

import java.util.Deque;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentLinkedDeque;

public class ProducerConsumerUnsafe {
    public static void main() throws InterruptedException {
        Deque<Integer> q = new ConcurrentLinkedDeque<>();
        ProducerUnsafe p = new ProducerUnsafe("Producer", q);
        ConsumerUnsafe c = new ConsumerUnsafe("Consumer", q);

        p.start();
        c.start();

        Thread.sleep(100);

        p.interrupt();
        c.interrupt();

        p.join();
        c.join();
    }

    public static class ProducerUnsafe extends Thread {
        private final Deque<Integer> q;

        public ProducerUnsafe(String name, Deque<Integer> q) {
            super(name);
            this.q = q;
        }

        @Override
        public void run() {
            while (!isInterrupted()) {
                q.push(1);
            }
        }
    }

    public static class ConsumerUnsafe extends Thread {
        private final Deque<Integer> q;

        public ConsumerUnsafe(String name, Deque<Integer> q) {
            super(name);
            this.q = q;
        }

        @Override
        public void run() {
            int total = 0;
            while (!isInterrupted()) {
                try {
                    q.pop();
                    ++total;
                } catch (NoSuchElementException e) {
                    Thread.yield();
                }
            }
            System.out.printf("Total number of consumed elements: %d\n", total);
        }
    }
}
