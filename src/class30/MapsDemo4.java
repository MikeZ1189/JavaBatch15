package class30;

import java.util.HashMap;
import java.util.Set;

public class MapsDemo4 {
    public static void main(String[] args) {

        HashMap<String, Double> makeup=new HashMap<>();
        makeup.put("Lipstick", 50.0);
        makeup.put("foundation", 40.0);
        makeup.put("mascara", 70.0);
        makeup.put("eyeliner", 12.2);
        makeup.put("Blush-on", 12.2);

        // To get all the keys we can use keySet method from Map interface
        Set<String> allKeys=makeup.keySet();
        System.out.println(allKeys);

        for(String s : allKeys){
            System.out.println(s);
        }
        // Delete all the entries from the map which the size of the key is greater than 7

        allKeys.removeIf(x->x.length()>7);
        System.out.println(allKeys);
    }
}
