package class29;


import java.util.HashSet;

public class SetsDemo1 {
    public static void main(String[] args) {

        // HashSet does not allow duplicate values and it does not maintain insertion order
        HashSet<String> fruit=new HashSet<>();
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Orange");
        fruit.add("Mango");
        System.out.println(fruit);

    }
}
