import java.util.ArrayList;

public class Storage {
    private String name;
    public static ArrayList<String> list = new ArrayList<>();

    public void insert(String name) throws DataExistsException{
        if(list.contains(name)) {
            throw new DataExistsException(name);
        }
        else {
            list.add(name);
            System.out.println(name + " Successfully added!");
        }
    }
}
