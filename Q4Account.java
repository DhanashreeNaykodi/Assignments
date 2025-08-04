public class Q4Account {

    private int id;
    private String name;
    private double balance = 10000;

     static void transferAmt(Q4Account FromAcc, Q4Account ToAcc, double amt) {

         Q4Account first;
         Q4Account second;

         if(FromAcc.id > ToAcc.id) {
             first = FromAcc;
             second = ToAcc;
         }
         else {
             first = ToAcc;
             second = FromAcc;
         }

         synchronized (FromAcc) {
             synchronized (ToAcc) {
                 if (FromAcc.balance >= amt) {
                     FromAcc.withdraw(amt);
                     try {
                         Thread.sleep(200);
                     } catch (InterruptedException e) {
                         System.out.println("Error");
                     }
                     ToAcc.deposit(amt);
                     System.out.println("* Amount transferred from " + FromAcc.name + " to " + ToAcc.name);
                     System.out.println("Balance in " + FromAcc.name + " : " + FromAcc.balance);
                     System.out.println("Balance in " + ToAcc.name + " : " + ToAcc.balance);
                 } else {
                     System.out.println("Insufficient balance");
                 }
             }
         }
     }

    public Q4Account(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void deposit(double amt) {
        if(amt > 0) {
            balance += amt;
        }
        else {
            System.out.println("Invalid amount.");
        }
    }

    void withdraw (double amt) {
        if(balance >= amt) {
            balance -= amt;
        }
        else {
            System.out.println("Invalid amount.");
        }
    }
}
































//         Account2 first = FromAcc.id < ToAcc.id ? FromAcc : ToAcc;
//         Account2 second = FromAcc.id < ToAcc.id ? ToAcc : FromAcc;
//
//         boolean done = false;
//
//         while(!done) {
//             boolean gotFirst = first.lock.tryLock();
//             boolean gotSecond = second.lock.tryLock();
//
//             if (gotFirst && gotSecond) {
//                 try {
//                     if(FromAcc.balance >= amt) {
//                         FromAcc.withdraw(amt);
//                         try {
//                             Thread.sleep(200);
//                         } catch (InterruptedException e) {
//                             System.out.println("Error");
//                         }
//                         ToAcc.deposit(amt);
//                         System.out.println("* Amount transferred from " + FromAcc.name + " to " + ToAcc.name);
//                         System.out.println("Balance in " + FromAcc.name + " : " + FromAcc.balance);
//                         System.out.println("Balance in " + ToAcc.name + " : " + ToAcc.balance);
//                     }
//                     else {
//                         System.out.println("Insufficient balance");
//                     }
//                     done = true;
//                 }
//
//                 finally {
//                     first.lock.unlock();
//                     second.lock.unlock();
//                 }
//             }
//             else {
//                 if(gotFirst) {first.lock.unlock();}
//                 if(gotSecond) {second.lock.unlock();}
//
//                 try {
//                     Thread.sleep(10);
//                 } catch (InterruptedException e) {
//                     e.printStackTrace();
//                 }
//             }
//         }
    //}





//Without locking -
//- not thread safe
//- with simple logic & short runs, timimg issues might not appear
//- Both threads execute at same time, if both threads read/write
//  balance at the same time it may cause, lost updates, partial transfers,
//  deadlocks

//if(FromAcc.balance >= amt) {
//        FromAcc.withdraw(amt);
//            try {
//                    Thread.sleep(200);
//            } catch (InterruptedException e) {
//        System.out.println("Error");
//            }
//                    ToAcc.deposit(amt);
//        }
//                System.out.println("Amount transferred from " + FromAcc.name + " to " + ToAcc.name);
//         System.out.println("Balance in " + FromAcc.name + " : " + FromAcc.balance);
//         System.out.println("Balance in " + ToAcc.name + " : " + ToAcc.balance);


//To avoid deadlock -
//one way can be to acquire locks in a consistent order or
//Multiple resources should acquire lock in same sequence. (ID)