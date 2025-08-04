//Problem: Create a program that simulates a race between 3 runners, each represented by a separate thread.
// The threads should start at the same time and print their progress in intervals. The race ends when the first
// runner completes a fixed number of steps.
//	Objective: Understand how to start threads and manage their lifecycle using Thread class or Runnable interface.

import java.util.concurrent.atomic.AtomicBoolean;

public class Q1RaceRunner {

    private static final int end = 15;

    static class Runner implements Runnable {
        private final String name;
        private final AtomicBoolean raceOver;

        Runner(String name, AtomicBoolean raceOver) {
            this.name = name;
            this.raceOver = raceOver;
        }

        @Override
        public void run() {
            for (int step = 1; step <= end; step++) {

                if (raceOver.get()) {
                    System.out.println(name + " stopped at step " + step + " (Race already over)");
                    break;
                }

                System.out.println(name + " took step " + step);

                try {
                    Thread.sleep((long) (Math.random() * 200));  // simulate random running speed
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }

                if (step == end && raceOver.compareAndSet(false, true)) {
                    System.out.println(name + " has finished the race!");
                }
            }
        }
    }

    public static void main(String[] args) {

        AtomicBoolean raceOver = new AtomicBoolean(false);

        Thread runner1 = new Thread(new Runner("Runner-1", raceOver));
        Thread runner2 = new Thread(new Runner("Runner-2", raceOver));
        Thread runner3 = new Thread(new Runner("Runner-3", raceOver));

        runner1.start();
        runner2.start();
        runner3.start();
    }
}
