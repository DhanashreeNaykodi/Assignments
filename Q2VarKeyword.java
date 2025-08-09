//Write a program that demonstrates the usage of the var keyword to declare variables with inferred types.

package Assignment_4;

import java.util.ArrayList;

public class Q2VarKeyword {

    //var instanceVariable = 4;

    public static void main(String[] args) {

        //var<Integer> list = new ArrayList<>();
        //var s;
        //var d = null;

        var name = "Dhanashree";
        var count = 10;
        System.out.println(name);
        System.out.println(count);

        var list = new ArrayList<Integer>();

        for(var i=1 ;i<=10 ;i++)
        {
            list.add(i);
        }

        for(var i : list) {
            System.out.print(i + " ");
        }

    }
}
