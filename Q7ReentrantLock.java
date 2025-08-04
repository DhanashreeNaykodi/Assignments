//*******

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class IncrementCounter {

    private int count = 0;
    private final Lock lock = new ReentrantLock(true);

    public void modify(){
        lock.lock();
        try{
            System.out.println(Thread.currentThread().getName() + " acquired lock");
            count++;
            System.out.println(Thread.currentThread().getName() + " incremented count to " + count);
            try{
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        finally {
            System.out.println(Thread.currentThread().getName() + " released lock");
            lock.unlock();
        }
    }

//    @Override
//    public void run() {
//
//        lock.lock();
//            try {
//                for (int i = 0; i < 2000; i++) {
//                    System.out.println(Thread.currentThread().getName() + " aquaired the lock");
//                    count++;
//                    System.out.println(Thread.currentThread().getName() + " incremented the counter : " + count);
//                }
//
//                Thread.sleep(1);
//
//            } catch (InterruptedException e) {
//                System.out.println("Exception: " + e.getMessage());
//            } finally {
//                lock.unlock();
//            }
//    }
}

public class Q7ReentrantLock {
    public static void main(String[] args) throws InterruptedException {
//        IncrementCounter c = new IncrementCounter();
//
//        Thread t1 = new Thread(c, "Thread-1");
//        Thread t2 = new Thread(c, "Thread-2");
//        Thread t3 = new Thread(c, "Thread-3");
//
//        t1.start();
//        t2.start();
//        t3.start();
//
//        t1.join();
//        t2.join();
//        t3.join();
        IncrementCounter ic = new IncrementCounter();

        for (int i = 0; i < 20; i++) {
            Thread t = new Thread(() -> {
                ic.modify();
            });
            t.start();
            //Thread.sleep(10);   gives time for previous i thread to acquire lock first
        }

    }
}
































//Due to OS-level scheduling, Thread-17 might reach the lock first (before Thread-16 even starts or reaches
// lock.lock()).
//
//Fairness only applies to threads that are waiting when the lock is already held.
//
//If a thread reaches the lock when it's free, it can take it immediately, regardless of any others.