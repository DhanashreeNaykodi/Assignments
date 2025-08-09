//Write a program that calculates the number of days in a given month using the new
//switch expression.

package Assignment_4;

import java.util.Scanner;

public class Q1SwitchExpression {

    static String method(int year) {
        if(year % 4 == 0 && year % 400 == 0) {
            if(year % 100 != 0) {
                return "There are 29 days";
            }
        }
        return "There are 28 days";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month ");
        String month = sc.nextLine();

        var days = switch(month.toUpperCase()) {                     //exp

            case "JANUARY", "MARCH", "MAY", "JULY", "AUGUST", "OCTOBER", "DECEMBER" -> {
                yield "There are " + 31 + " days in " + month;
            }

            case "APRIL", "JUNE", "SEPTEMBER", "NOVEMBER" -> {
                yield "There are " + 30 + " days in " + month;
            }

            case "FEBRUARY" -> {
                yield method(2025);
            }

            default -> "Invalid month";

        };

        System.out.println(days);
    }
}









//if month pass is may != May, doesn't ignore case and print invalid month
