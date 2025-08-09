//Create a sequenced set and demonstrate iterating over the set in forward and reverse order.

package Assignment_4;

import java.util.*;

public class Q9SequencedSet {

    public static void main(String[] args) {

        SequencedSet<Integer> set = new LinkedHashSet<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements in the list : ");

        for(int i=0; i<5; i++) {
            set.add(sc.nextInt());
        }

        System.out.println("List elements : ");

        Iterator<Integer> it = set.iterator();
        while(it.hasNext())
        {
            Integer x = it.next();
            System.out.print(x + " ");
        }

        System.out.println();
        System.out.println("First element : " + set.getFirst());
        System.out.println("Last element : " + set.getLast());
        System.out.println("Reversed set : " + set.reversed());

    }
}
