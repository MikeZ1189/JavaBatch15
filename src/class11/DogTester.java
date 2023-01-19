package class11;

import java.util.Scanner;

public class DogTester {
    public static void main(String[] args) {
        // creating an actual object from the class Scanner
        Scanner scanner=new Scanner(System.in);
        //scanner.next();
        // This is how we create the objects of the class
        Dog dog1= new Dog();
        dog1.bark();
    }
}
