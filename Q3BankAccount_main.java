
//Problem: Write a program to simulate a bank account system where multiple threads can deposit and withdraw money.
// Ensure that the balance updates correctly when multiple transactions happen concurrently.
//	Objective: Understand how to use the synchronized keyword to avoid race conditions and ensure thread safety.

public class Q3BankAccount_main implements Runnable{
    BankAccount bank = new BankAccount();

    @Override
    public void run() {
        try {
            bank.deposit(500);
            Thread.sleep(1000);
            bank.withdraw(200);
        }
        catch(InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Q3BankAccount_main Main = new Q3BankAccount_main();
        Thread t1 = new Thread(Main);
        Thread t2 = new Thread(Main);

        t1.start();
        t2.start();
    }
}