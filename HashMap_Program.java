import java.util.HashMap;
import java.util.Map;

public class HashMap_Program {
    HashMap<Integer, String> map = new HashMap<>();

    public void addData(int[] Ids, String[] names) {
        for (int i = 0; i < Ids.length; i++) {
            map.put(Ids[i], names[i]);
        }
    }

    public void removeID(int id) {
        if (map.remove(id) != null) {
            System.out.println("ID " + id + " removed successfully.");
        }
    }

    public void printMap() {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }

    public static void main(String[] args) {

        int[] ids = {101, 102, 103, 104, 105};
        String[] names = {"Pooja", "Shruti", "Amay", "Amy", "Sakshi"};

        HashMap_Program obj = new HashMap_Program();
        obj.addData(ids,names);

        obj.removeID(103);
        obj.printMap();
    }
}
