//package Assignment_4;
//Write a program that uses unnamed classes and unnamed variables (if available in your Java version)
//to instantiate an anonymous class.

import java.util.ArrayList;
import java.util.Scanner;

void main() {

    System.out.println("Enter false to stop.");
    System.out.println("Enter items to buy : ");

    ArrayList<String> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    String item = sc.nextLine();

    while(!item.equalsIgnoreCase("false")) {
        list.add(item);
        item = sc.nextLine();
    }

    int count = 0;
    for(String _ : list) {
        count++;
    }
    System.out.println("You bought " + count + " items");

}