package reviewclass10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class AllElementFromSet {
    public static void main(String[] args) {

        // Set is a collection of unique elements
        Set<String> qaJobs = new HashSet<>(); // does not maintain the order
        // adding object/elements to the collection
        qaJobs.add("Automation Engineer");
        qaJobs.add("Manual Tester");
        qaJobs.add("SDET");
        qaJobs.add("QA Analyst");
        qaJobs.add("Api Tester");
        qaJobs.add("Database Tester");
        System.out.println(qaJobs);

        // how to get all vales from Set
        //1 - enhanced for loop

        for (String qa : qaJobs) {
            System.out.print(qa+" ");
        }
        System.out.println(" --------------------------------- ");
        //2 - using iterator
        // Iterator Interface has 3 methods: hasNext(), next(), remove();
        Iterator<String>  it=qaJobs.iterator();
        while(it.hasNext()){
            String element=it.next();
            System.out.print(element+" ");
        }

    }
}
