package class15;

public class DogTester {
    public static void main(String[] args) {
        System.out.println("Start");
        Dog dog = new Dog();
        dog.printFood();
        System.out.println("End");

        for (int i = 0; i < 2; i++) {
            System.out.println(i);
        }
       // System.out.println(i); can't use outside the block of code
    }
}
