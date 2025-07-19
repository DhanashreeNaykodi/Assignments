//Accept salary from user along with choice to calculate tax using Old Tax Regime or New Tax Regime
//and calculate the tax for the given salary.

import java.util.Scanner;
public class Q5 {

    static void CalcOld (long salary) {
        double tax = 0L;
        if(salary <= 250000) {
            System.out.println("No Tax!");
            return;
        }
        else if(salary > 250000 && salary <= 500000) {
            tax = 0.05 * salary;
        }
        else if(salary > 500000 && salary <= 750000) {
            tax = 0.10 * salary;
        }
        else if(salary > 750000 && salary <= 1000000) {
            tax = 0.15 * salary;
        }
        else if(salary > 1000000 && salary <= 1250000) {
            tax = 0.20 * salary;
        }
        else if(salary > 1250000 && salary <= 1500000) {
            tax = 0.25 * salary;
        }
        else{
            tax = 0.30 * salary;
        }
        System.out.println("Tax for " + salary + " : " + String.format("%.2f", tax));
    }

    static void CalcNew(long salary) {
        double tax = 0L;
        if(salary <= 250000) {
            System.out.println("No Tax!");
            return;
        }
        else if(salary > 250000 && salary <= 500000) {
            tax = 0.05 * salary;
        }
        else if(salary > 500000 && salary <= 1000000) {
            tax = 0.20 * salary;
        }
        else{
            tax = 0.30 * salary;
        }
        System.out.println("Tax for " + salary + " : " + String.format("%.2f", tax));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your salary : ");
        long salary = sc.nextLong();

        System.out.println("How would you want to calculate your tax?");
        System.out.println("Enter 0 : To quit. \nEnter 1 : Calculate using Old Tax Regime. \nEnter 2 : Calculate using New Tax Regime.");
        int choice = sc.nextInt();

        switch(choice) {
            case 0 :
                System.out.println("Quitting..");
                break;
            case 1 :
                CalcOld(salary);
                break;
            case 2 :
                CalcNew(salary);
                break;
            default :
                System.out.println("Wrong option entered!");
                break;
        }
    }
}
