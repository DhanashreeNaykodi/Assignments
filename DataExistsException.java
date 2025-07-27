import java.util.ArrayList;

public class DataExistsException extends Exception{
//    String name;

    public DataExistsException(String name) {
        super("#"+name + " - Given name already exists in the Database!");
    }
}
