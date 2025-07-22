//In a program, input 3 numbers : compute the average of three numbers

import java.util.Scanner;

public class Average {
    static void calc(int a, int b, int c) {
        System.out.println("Average is : " + (a+b+c)/3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        int a = sc.nextInt();
        System.out.println("Enter number 2 : ");
        int b = sc.nextInt();
        System.out.println("Enter number 35 : ");
        int c = sc.nextInt();

        calc(a,b,c);
    }
}
