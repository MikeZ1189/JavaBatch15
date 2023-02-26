package class29;

import java.util.ArrayList;

/*
1) Create an ArrayList that will store 5 names into it.
Find out whether the given ArrayList is empty or not?
Check whether the specific name is present in an ArrayList or not?
Find the size of your arrayList and print all values from that

 */
public class Task1 {
    public static void main(String[] args) {
        ArrayList <String> names=new ArrayList<>();
        names.add("Anush");
        names.add("Manshu");
        names.add("Kanshu");
        names.add("Panshu");
        names.add("Dananshu");

        System.out.println(names.isEmpty());
        System.out.println(names.contains("Mike"));
        System.out.println(names.size());
        System.out.println(names);

    }
}
