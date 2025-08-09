//Java program to demonstrate the creation of virtual threads for concurrent execution using the
//Thread.ofVirtual().start()

package Assignment_4;

public class Q6VirtualThread implements Runnable {

    @Override
    public void run() {
        System.out.println("Virtual Thread started. \n" + Thread.currentThread());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Virtual thread finished...");
    }

    public static void main(String[] args) {

        Q6VirtualThread task = new Q6VirtualThread();

        Thread thread = Thread.ofVirtual().start(task);

        try {
            thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
