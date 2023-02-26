package class30;

import java.util.LinkedHashSet;

/*
Create a Set of cities in which you want to make sure that insertion order is maintained.
Then remove any city that starts with “A”;
 */
public class Task1 {
    public static void main(String[] args) {
        LinkedHashSet<String> cities=new LinkedHashSet<>();
        cities.add("Richmond");
        cities.add("FairFax");
        cities.add("Mclean");
        cities.add("Annandale");

        cities.removeIf(city -> city.startsWith("A")); //lambda
        System.out.println(cities);
    }
}
