//Create a sealed class hierarchy where Animal is a sealed class and Dog and Cat are its
//permitted subclasses.

package Assignment_4;

sealed class Animal permits Dog, Cat {
    void display () {
        System.out.println("Animal class");
    }
}

non-sealed class Dog extends Animal {
        void display() {
        System.out.println("Dog class");
    }
}

final class Cat extends Animal {
    void display() {
        System.out.println("Cat class");
    }
}

public class Q4SealedClass {
    public static void main(String[] args) {

        Animal obj = new Animal();
        obj.display();
        Animal dog = new Dog();
        dog.display();
        Animal cat = new Cat();
        cat.display();

    }
}
