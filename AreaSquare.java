//In a program, input the side of a square. You have to output the area of the square

import java.util.Scanner;

public class AreaSquare {
    static int calc(int n) {
        return n*n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        System.out.println("Area of square: " + calc(n));
    }
}
