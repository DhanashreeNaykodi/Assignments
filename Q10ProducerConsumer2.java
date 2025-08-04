//Problem : You are required to implement a Producer-Consumer system using two threads.
// The Producer thread should generate items (in this case, integers) and the Consumer thread should consume
// these items. The producer should wait if the buffer (queue) is full, and the consumer should wait if the buffer is empty.

import java.util.LinkedList;
import java.util.Queue;

public class Q10ProducerConsumer2 {

     static class SharedBuffer {

        private final int capacity = 5;
        final Queue<Integer> queue = new LinkedList<>();

        synchronized void produce(int value) throws InterruptedException {

            while(queue.size() == capacity) {
                System.out.println("Queue is Full! Waiting for consumer to consume...");
                wait();      //  will pause execution & release object's lock
            }
            queue.add(value);
            System.out.println("Produced item : " + value);
            notify();
        }

        synchronized void consume() throws InterruptedException {

            Thread.sleep(5000);
            while(queue.size() < 1) {
                System.out.println("Queue is Empty! Waiting for producer to produce...");
                wait();
            }
            System.out.println("Before consuming queue : " + queue);
            System.out.println("Consumed item : " + queue.peek());
            queue.remove();
            System.out.println("After consuming queue : " + queue);
            notify();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        SharedBuffer buffer = new SharedBuffer();

        Thread t1 = new Thread(() -> {
            for(int i=0; i<10; i++) {
                try {
                    buffer.produce(i);
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i=0; i<10; i++) {
                try {
                    buffer.consume();
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        //System.out.println(buffer.queue);
    }
}












// For non static inner method call -
//ProducerConsumer2 pc = new ProducerConsumer2();
//SharedBuffer buffer = pc.new SharedBuffer();