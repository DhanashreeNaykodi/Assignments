
//Problem: Simulate a relay race where each runner (thread) has to wait for the previous runner to finish before
// starting. Use CountDownLatch to ensure that the second runner starts only after the first runner finishes, and
// so on.
//Objective: Learn how to use CountDownLatch to coordinate between threads where some threads need to wait for
// others to finish.

import java.util.concurrent.CountDownLatch;

class Runner implements Runnable
{
    private String name;
    private CountDownLatch waitForPrev;
    private CountDownLatch signalNext;

    public Runner(String runnerName, CountDownLatch waitForPrevious, CountDownLatch signalNext)
    {
        this.name = runnerName;
        this.waitForPrev = waitForPrevious;
        this.signalNext = signalNext;
    }

    public void run()
    {
        try {

            // Wait for the previous runner to finish
            if (waitForPrev != null) {
                waitForPrev.await();
            }
            System.out.println(name + " started running!");
            Thread.sleep(1000);
            System.out.println(name + " finished running!");

            // Signal the next runner to start
            if (signalNext != null) {
                signalNext.countDown();
            }
        } catch (InterruptedException e) {
            System.out.println(name + " was interrupted!");
        }
    }
}

public class Q6RelayRace {
    public static void main(String[] args) {

        CountDownLatch latch1 = new CountDownLatch(1);
        CountDownLatch latch2 = new CountDownLatch(1);
        CountDownLatch latch3 = new CountDownLatch(1);
        CountDownLatch latch4 = new CountDownLatch(1);

        Thread runner1 = new Thread(new Runner("Runner 1", null, latch1));
        Thread runner2 = new Thread(new Runner("Runner 2", latch1, latch2));
        Thread runner3 = new Thread(new Runner("Runner 3", latch2, latch3));
        Thread runner4 = new Thread(new Runner("Runner 4", latch3, latch4));

        runner1.start();
        runner2.start();
        runner3.start();
        runner4.start();

        try {
            //wait until the latch count goes to 0
            latch4.await();
            System.out.println("Race finished!");
        } catch (InterruptedException e) {
            System.out.println("Race was interrupted!");
        }
    }
}