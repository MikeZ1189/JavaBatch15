package reviewclass10;

import java.util.*;

public class CollectionViewOfMap {
    public static void main(String[] args) {

        Map<String, Double> grocery=new LinkedHashMap<>();
        // to store values inside the map we use method put
        grocery.put("Milk",5.99);  //K+V = Entry Object
        grocery.put("Eggs",6.50);
        grocery.put("Bread",2.99);
        grocery.put("Tea",4.99);
        grocery.put("Cucumber",2.50);
        grocery.put("Eggs",7.99);
        grocery.put("Tomato",2.50);

        Set<String> keys=grocery.keySet();
        for(String key:keys){
            System.out.print(key+" = "+grocery.get(key));
        }
        System.out.println(" ------------------------------------------ ");

        Iterator<String> iter=keys.iterator();
        while(iter.hasNext()){
            //how to print Key+Value?
            String k=iter.next();
            System.out.print(k+" == "+grocery.get(k));

        }

        System.out.println(" ------------------------------------------ ");
        Collection<Double>values=grocery.values();

        //print all value
        for(double val:values){
            System.out.print(val+", ");
        }
    }
}
