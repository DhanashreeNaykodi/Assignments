import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayList_LinkedList
{
    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<>();

        long start = System.currentTimeMillis();
        for(int i=1; i<=5000; i++) {
            arraylist.add(i);
        }
        for(int i=1; i<=5000; i++) {
            arraylist.add(i);
        }
        System.out.println("ArrayList before removal of 5th element : " + arraylist);
        arraylist.remove(4);
        long end = System.currentTimeMillis();

        System.out.println("time  : " + (end - start));
        System.out.println("ArrayList after removal of 5th element : " + arraylist);


        long start1 = System.currentTimeMillis();
        LinkedList<Integer> linkedlist = new LinkedList<>();
        for(int i=1; i<=5000; i++) {
            linkedlist.add(i);
        }
        for(int i=1; i<=5000; i++) {
            linkedlist.add(i);
        }
        System.out.println("LinkedList before removal of 5th element : " + linkedlist);
        linkedlist.remove(4);
        long end1 = System.currentTimeMillis();

        System.out.println("time  : " + (end1 - start1));
        System.out.println("LinkedList after removal of 5th element : " + linkedlist);
    }
}
