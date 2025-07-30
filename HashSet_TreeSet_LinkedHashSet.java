import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSet_TreeSet_LinkedHashSet {
    HashSet<Integer> hashSet = new HashSet<>();
    LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
    TreeSet<Integer> treeSet = new TreeSet<>();

    public void addinHashset(int[] items) {
        for (int i : items) {
            hashSet.add(i);
        }
    }

    public void addinLinkedHashSet(int[] items) {
        linkedHashSet = new LinkedHashSet<>(hashSet);
        for (int i : items) {
            linkedHashSet.add(i);
        }
    }

    public void addinTreeSet(int[] items) {
        for (int i : items) {
            treeSet.add(i);
        }
    }

    public void printHashSet() {
        System.out.println("HashSet contents:");
        for (int i : hashSet) {
            System.out.println("Element: " + i);
        }
    }

    public void printLinkedHashSet() {
        System.out.println("LinkedHashSet contents:");
        for (int i : linkedHashSet) {
            System.out.println("Element: " + i);
        }
    }

    public void printTreeSet() {
        System.out.println("TreeSet contents:");
        for (int i : treeSet) {
            System.out.println("Element: " + i);
        }
    }

    public static void main(String[] args) {
        int items[] = {63,902,63,572,882};

        HashSet_TreeSet_LinkedHashSet obj = new HashSet_TreeSet_LinkedHashSet();
        obj.addinHashset(items);
        obj.addinLinkedHashSet(items);
        obj.addinTreeSet(items);

        obj.printHashSet();
        obj.printLinkedHashSet();
        obj.printTreeSet();
    }
}
