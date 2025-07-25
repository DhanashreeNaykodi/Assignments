import java.util.ArrayList;

public class SortListUsingLambda {
    public static void main(String[] args) {
        ArrayList<Employee2> emp = new ArrayList<>();
        emp.add(new Employee2("Bob", 23, 15000));
        emp.add(new Employee2("Charlie",45, 90000));
        emp.add(new Employee2("Alice",20, 85000));

        emp.sort((a, b) -> a.getAge() - b.getAge());
        System.out.println(emp.toString());

        emp.sort((a,b) -> a.getSalary() - b.getSalary());
        System.out.println(emp.toString());
    }
}
