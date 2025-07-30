import java.util.Collections;
import java.util.LinkedList;

public class SortListUsingLambda_Student {

    public static void main(String[] args) {

        LinkedList<Student> student = new LinkedList<>();
        student.add(new Student("Pooja",15));
        student.add(new Student("Amy", 20));
        student.add(new Student("Sammy",21));
        student.add(new Student("Simran",18));


        student.sort((a, b) -> a.name.charAt(0) - b.name.charAt(0));
        System.out.println(student);

        student.sort((a,b) -> a.age - b.age);
        System.out.println(student);
    }
}
