package class29;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class SetDemo5 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(30);
        System.out.println(numbers);

        // write some logic to remove duplicates from above list
        LinkedHashSet<Integer> duplicate=new LinkedHashSet<>(numbers);
        System.out.println(duplicate);
    }
}
