//program to demonstrate how Java is pass-by-value.

public class PassByValue {
    private int eyes;

    static void changeObj(PassByValue p) {
        p.eyes = 13;
    }

    static void changePrimitive(int a) {
        a = 10;
    }

    public static void main(String[] args) {
        //Primitives
        int a = 2;
        changePrimitive(a);
        System.out.println(a);

        //Objects
        PassByValue p = new PassByValue();
        p.eyes = 2;
        changeObj(p);
        System.out.println(p.eyes);
    }

}
