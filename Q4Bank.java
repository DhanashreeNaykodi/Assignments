public class Q4Bank {
    public static void main(String[] args) throws InterruptedException {

        Q4Account account1 = new Q4Account(101, "SBI Account");
        Q4Account account2 = new Q4Account(102, "HDFC Account");

        Thread t1 = new Thread(() -> {
            for(int i=0; i<10; i++) {
                Q4Account.transferAmt(account1,account2,100);
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i=0; i<5; i++) {
                Q4Account.transferAmt(account2,account1,100);
            }
        });

        t1.start();
        Thread.sleep(500);
        t2.start();

        t1.join();
        t2.join();
    }
}

