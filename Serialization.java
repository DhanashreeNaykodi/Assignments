import java.io.*;

class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    private String emp_name;
    private int emp_age;
    private transient String emp_password;

    public Employee(String emp_name, int emp_age, String emp_password) {
        this.emp_name = emp_name;
        this.emp_age = emp_age;
        this.emp_password = emp_password;
    }

    @Override
    public String toString() {
        return "Student{name='" + emp_name + "', age=" + emp_age + ", password='" + emp_password + "'}";
    }
}
public class Serialization {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John Doe", 21, "mySecret123");
        String filePath = "emp.txt";

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(emp1);
            System.out.println("Student object saved to " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            Employee savedEmp = (Employee) ois.readObject();
            System.out.println("Deserialized Student object:");
            System.out.println(savedEmp);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
