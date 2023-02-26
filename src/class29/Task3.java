package class29;

import java.util.ArrayList;

/*
Create an arrayList of words. Remove every word that ends with “e”.
 */
public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> word = new ArrayList<>();
        word.add("empathize");
        word.add("working");
        word.add("change");
        word.add("learning");

        word.removeIf(x -> x.endsWith("e"));
        System.out.println(word);
    }
}
