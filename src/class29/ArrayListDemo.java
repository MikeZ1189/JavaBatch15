package class29;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        //  Dog d1=new Dog("Jacky", "Persian", 15)

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Jacky", "Persian", 15));
        dogs.add(new Dog("Jami", "German", 5));
        dogs.add(new Dog("Jimmi", "Bulldog", 15));
        dogs.add(new Dog("Mami", "Unknown", 10));

        for (Dog d : dogs) {
            d.printDogName();
        }
    }
}
