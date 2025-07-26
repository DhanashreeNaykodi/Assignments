import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSet_TreeSet_LinkedHashSet {

    public static void main(String[] args) {


        HashSet<Integer> hashset2 = new HashSet<>();
        hashset2.add(63);
        hashset2.add(902);
        hashset2.add(63);
        hashset2.add(572);
        hashset2.add(882);
        System.out.println("HashSet : " + hashset2);

        LinkedHashSet<Integer> linkedhashset = new LinkedHashSet<>();
        linkedhashset.add(34);
        linkedhashset.add(32);
        linkedhashset.add(33);
        linkedhashset.add(33);
        System.out.println("LinkedHashSet : " + linkedhashset);


        TreeSet<Integer> treeset = new TreeSet<>();
        treeset.add(3);
        treeset.add(2);
        treeset.add(1);
        treeset.add(4);
        treeset.add(3);
        System.out.println("TreeSet : " + treeset);

    }
}
