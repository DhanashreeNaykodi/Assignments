public class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String getName() {
        return name;
    }
    int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }
}
