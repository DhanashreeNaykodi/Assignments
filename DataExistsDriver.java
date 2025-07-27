public class DataExistsDriver {
    public static void main(String[] args) {
        Storage s = new Storage();

        try {
            s.insert("Dhanashree");
            s.insert("Bhosale");
            s.insert("Shruti");
            s.insert("Shruti");

        } catch (DataExistsException e) {
            System.out.println(e);
            System.out.println(e.getMessage());
        }
    }
}
