//Problem: You are required to implement a Ping-Pong game using two threads. One thread should print
// "Ping" and the other should print "Pong" in a sequential and synchronized manner. Your program should
// ensure that "Ping" is printed, then "Pong", and so on, without any skipping or repeated prints.

public class Q9PingPongGame {

    boolean button = true;

    synchronized void printPing() throws InterruptedException {
        while(!button) {
            wait();
        }
        System.out.println("Ping");
        button = false;
        notifyAll();
    }

    synchronized void printPong() throws InterruptedException {
        while (button) {
            wait();
        }
        System.out.println("Pong");
        button = true;
        notifyAll();
    }

    public static void main(String[] args) {

        Q9PingPongGame game = new Q9PingPongGame();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    game.printPing();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    game.printPong();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();
    }
}
