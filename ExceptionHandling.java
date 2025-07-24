import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str_num1 = sc.next();
        String str_num2 = sc.next();

        try {
            int num1 = Integer.parseInt(str_num1);
            int num2 = Integer.parseInt(str_num2);
            int den = num1/num2;
            System.out.println(den);

        } catch (ArithmeticException | NumberFormatException e) {
            System.out.println(e);
        }
    }
}
