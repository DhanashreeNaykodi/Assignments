import java.util.HashMap;

public class HashMap_Program {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(101,"Pooja");
        map.put(102,"Shruti");
        map.put(103,"Amay");
        map.put(104,"Amy");
        map.put(105,"Sakshi");

        map.remove(103);

        System.out.println(map);
    }
}
