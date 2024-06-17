package threads;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

public class ProducerConsumerSafe {
    public static void main() throws InterruptedException {
        Deque<Integer> q = new ArrayDeque<>();
        Producer p = new Producer("Producer", q);
        Consumer c = new Consumer("Consumer", q);

        p.start();
        c.start();

        Thread.sleep(100);

        p.interrupt();
        c.interrupt();

        p.join();
        c.join();
    }

    public static class Producer extends Thread {
        private final Deque<Integer> q;

        public Producer(String name, Deque<Integer> q) {
            super(name);
            this.q = q;
        }

        @Override
        public void run() {
            while (!isInterrupted()) {
                synchronized (q) {
                    q.push(1);
                }
            }
        }
    }

    public static class Consumer extends Thread {
        private final Deque<Integer> q;

        public Consumer(String name, Deque<Integer> q) {
            super(name);
            this.q = q;
        }

        @Override
        public void run() {
            int total = 0;
            while (!isInterrupted()) {
                try {
                    synchronized (q) {
                        q.pop();
                        ++total;
                    }
                } catch (NoSuchElementException e) {
                    Thread.yield();
                }
            }
            System.out.printf("Total number of consumed elements: %d\n", total);
        }
    }
}
