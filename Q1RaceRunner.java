//Problem: Create a program that simulates a race between 3 runners, each represented by a separate thread.
// The threads should start at the same time and print their progress in intervals. The race ends when the first
// runner completes a fixed number of steps.
//	Objective: Understand how to start threads and manage their lifecycle using Thread class or Runnable interface.

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Q1RaceRunner {

    private static final AtomicInteger count = new AtomicInteger(0);
    private static final AtomicBoolean winner = new AtomicBoolean(false);

    static class Runner implements Runnable {
        private final int END = 10;

        @Override
        public void run() {
            while (!winner.get()) {  //will run as long as winner flag is false

                int step = count.incrementAndGet();  // only one thread will get each step number
                if (step > END) {
                    break;
                }
                System.out.println(Thread.currentThread().getName() + " took step " + step);

                //compareAndSet() is an atomic compare and swap(cas) - if winner variable's current value is false,
                //then set it to true.

                if (step == END && winner.compareAndSet(false, true)) {
                    System.out.println(Thread.currentThread().getName() + " has finished the race!");
                    break;
                }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }

        }
    }

    public static void main(String[] args) {

        Runner r = new Runner();

        Thread runner1 = new Thread(r);
        Thread runner2 = new Thread(r);
        Thread runner3 = new Thread(r);

        runner1.start();
        runner2.start();
        runner3.start();
    }
}




























//import java.util.ArrayList;
//import java.util.List;
//
//public class RunnersRace implements Runnable {
//    private static boolean finished = false;
//    private static final int MAX_STEPS = 10;
//    private static final List<Thread> allThreads = new ArrayList<>();
//    private final String name;
//
//    public RunnersRace(String name) {
//        this.name = name;
//        allThreads.add(Thread.currentThread());
//    }
//
//    @Override
//    public void run() {
//        try {
//            for (int step = 1; step <= MAX_STEPS; step++) {
//                if (finished) {
//                    System.out.println(name + " stopped early at step " + step);
//                    return;
//                }
//                System.out.println(name + " Step: " + step);
//                Thread.sleep(100);
//                if (step == MAX_STEPS) {
//                    finished = true;
//                    System.out.println(name + " finished the race!");
//                    for (Thread thread : allThreads) {
//                        thread.interrupt();
//                    }
//                    return;
//                }
//            }
//        } catch (InterruptedException e) {
//            System.out.println(name + " interrupted, exiting.");
//            return;
//        }
//    }
//
//    public static void main(String[] args) {
//        Thread t1 = new Thread(new RunnersRace("Runner-1"), "Runner-1");
//        Thread t2 = new Thread(new RunnersRace("Runner-2"), "Runner-2");
//        Thread t3 = new Thread(new RunnersRace("Runner-3"), "Runner-3");
//
//        t1.start();
//        t2.start();
//        t3.start();
//
//        try {
//            t1.join();
//            t2.join();
//            t3.join();
//        } catch (InterruptedException e) {
//            System.out.println("Main thread interrupted.");
//        }
//        System.out.println("Race ended.");
//    }
//}
