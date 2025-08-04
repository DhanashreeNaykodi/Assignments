
class BankAccount{
    private double balance = 1000;

    public synchronized void deposit(double amt) {
        if(amt > 0) {
            balance += amt;
            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e) {
                System.out.println("Interrupted deposit.");
            }
            System.out.println(Thread.currentThread().getName() + " has deposited. \n" +
                    "Updated balance : " + balance);
        }
        else {
            System.out.println("Invalid amount..");
        }
    }

    public synchronized void withdraw(double amt) {

        if(balance >= amt) {
            balance -= amt;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted withdraw");
            }
            System.out.println(Thread.currentThread().getName() + " has withdrawn. \n" +
                    "Remaining balance : " + balance);
        }
        else {
            System.out.println(Thread.currentThread().getName() + " Insufficient balance");
        }
    }
}
