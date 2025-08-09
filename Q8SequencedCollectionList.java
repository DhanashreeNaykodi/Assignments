//Write a program that demonstrates usage of the sequenced collection to iterate over a
//list in forward and reverse order.

package Assignment_4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.SequencedCollection;

public class Q8SequencedCollectionList {

    public static void main(String[] args) {

        SequencedCollection<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements in the list : ");

        for(int i=0; i<5; i++) {
            list.add(sc.nextInt());
        }

        System.out.println("List elements : ");

        Iterator <Integer> it = list.iterator();
        while(it.hasNext())
        {
            Integer x = it.next();
            System.out.print(x + " ");
        }

        System.out.println();
        System.out.println("First element : " + list.getFirst());   //it.next
        System.out.println("Last element : " + list.getLast());     //r

        System.out.println("Reversed list : " + list.reversed());

    }
}





































//reversed() - returns a reverse-ordered view of this collection
//The next() method of Iterator<Integer> returns an Integer object, not a primitive int
// //Iterator is an Interface
//list.iterator() on an ArrayList, it returns an instance of a private inner class
//The Itr class has fields like:
//next() returns current element and increments the pointer to next index
//cursor: An integer tracking the index of the next element to return (starts at 0).
//lastRet: The index of the last element returned by next() (used for remove()).
