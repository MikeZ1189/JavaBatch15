package class30;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
Create a map of countries with its capital that will store countries in alphabetical order.
Print all keys and values from a country map using for each loop and iterator.
Print all values from a country map using for each loop and iterator.
 */
public class MapsDemo8 {
    public static void main(String[] args) {

        TreeMap<String, String> countries = new TreeMap<>();
        countries.put("USA", "Washington DC");
        countries.put("Germany", "Berlin");
        countries.put("Japan", "Tokio");
        countries.put("Brazil", "Rio");

        //Set<Map.Entry<String,String>> entrySet= countries.entrySet();
       var entrySet=countries.entrySet();

       for (var entry: entrySet
       ){
           System.out.println(entry.getKey()+" "+entry.getValue());

       /* for (Map.Entry<String, String> entry : countries.entrySet()) {
            System.out.println(entry.getKey() + ", Value: " + entry.getValue());
        }
        for (String value : countries.values()) {
            System.out.println("Value: " + value);*/
        }
       var iterator =countries.entrySet().iterator();
       while(iterator.hasNext()){
           var entry=iterator.next();
           System.out.println(entry.getKey()+" "+entry.getValue());
       }
    }
}
