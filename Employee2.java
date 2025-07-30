public class Employee2 {
    String name;
    int age;
    int salary;

    Employee2(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return name + " " + age + " " + salary;
    }
}
