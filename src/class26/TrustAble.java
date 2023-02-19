package class26;

public interface TrustAble {
    public static final int age = 10; //constants
    String color = "blue";

    int trust(); // method with no parameters

    static void method1() {
        System.out.println("Hello world");
    }

    default void method2() {

    }
}

class Bank implements TrustAble {

    @Override
    public int trust() {
        return 0;
    }

    public static void main(String[] args) {
        TrustAble.method1();
        System.out.println(TrustAble.age);
    }
}

