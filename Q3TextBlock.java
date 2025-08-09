//Write a program that uses text blocks to store and display a multi-line SQL query.

package Assignment_4;

public class Q3TextBlock {

    public static void main(String[] args) {

        String query = """
                SELECT *
                FROM EMPLOYEE
                WHERE salary > 20000 """;


        System.out.println(query);

    }
}
