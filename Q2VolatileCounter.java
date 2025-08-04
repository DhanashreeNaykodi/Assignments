
public class Q2VolatileCounter {

    private static volatile int counter = 0;
    static volatile boolean running = true;

    static class Writer implements Runnable {

        @Override
        public void run() {
            while(running) {
                try {
                    counter++;
                    System.out.println(Thread.currentThread().getName() + " is incremented. Counter : " + counter);
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }

    static class Reader implements Runnable {

        @Override
        public void run() {
            while(running) {
                try {
                    System.out.println(Thread.currentThread().getName() + " is reading, counter is " + counter);
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        //Writer w = new Writer();
        //Reader r = new Reader();

        Thread t1 = new Thread(new Writer());
        Thread t2 = new Thread(new Reader());

        t1.start();
        t2.start();
        Thread.sleep(3000);

        running = false;

    }
}
