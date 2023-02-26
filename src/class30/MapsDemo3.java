package class30;

import java.util.HashMap;

/*
Create a map of a building. Store floor number and it is associated company name. (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
Check how many entries you have?
Update company on a 4th floor
Remove company on the 7th floor
Print your map
 */
public class MapsDemo3 {
    public static void main(String[] args) {

        HashMap<Integer, String> building = new HashMap<>();
        building.put(1, "Google");
        building.put(2, "Syntax");
        building.put(3, "Apple");
        building.put(4, "Microsoft");
        building.put(5, "HP");
        building.put(6, "Apple");
        building.put(7, "Dell");

        System.out.println(building.size());
        building.replace(4,"Lenovo");
        System.out.println(building);
        System.out.println(building.remove(7));
        System.out.println(building);

    }
}
