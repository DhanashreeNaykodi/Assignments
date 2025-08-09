//Write a program that demonstrates the use of a sequenced map to iterate over the
// entries in both insertion and reverse order.

package Assignment_4;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.SequencedMap;

public class Q10SequencedMap {

    public static void main(String[] args) {

        SequencedMap<Integer, String> map = new LinkedHashMap<>();

        System.out.println("Enter elements in map : ");
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<5; i++) {
            map.put(i, sc.nextLine());
        }

        System.out.println("Elements : ");
        for(Map.Entry<Integer, String> entry : map.sequencedEntrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println(map.firstEntry());
        System.out.println(map.reversed());

    }
}
