package class27;

import java.util.ArrayList;

public class Demo8 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<String>(); //basic syntax of ArrayList
        // using add method to add elements to this ArrayList
        names.add("Nelson");
        names.add("Sam");
        names.add("Diana");
        names.add("Zahra");
        names.add("Daria");
        names.add("Saba");

        System.out.println(names);
        names.clear();
        System.out.println(names);
    }
}
