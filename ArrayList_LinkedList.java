import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayList_LinkedList
{
    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<>();
        for(int i=1; i<=10; i++) {
            arraylist.add(i);
        }
        System.out.println("ArrayList before removal of 5th element : " + arraylist);
        arraylist.remove(4);
        System.out.println("ArrayList after removal of 5th element : " + arraylist);


        LinkedList<Integer> linkedlist = new LinkedList<>();
        for(int i=1; i<=10; i++) {
            linkedlist.add(i);
        }
        System.out.println("LinkedList before removal of 5th element : " + linkedlist);
        linkedlist.remove(4);
        System.out.println("LinkedList after removal of 5th element : " + linkedlist);
    }
}
