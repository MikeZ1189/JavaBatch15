package reviewclass9;

import java.util.ArrayList;

public class ArrayLIstDemo {
    public static void main(String[] args) {
        //The integer class wraps a value of the primitive type int in an object

        ArrayList <Integer> alist=new ArrayList<>();
        //to store values inside an arraylist
        alist.add(12);
        alist.add(13);
        alist.add(14);

        // how to find size of my arraylist
        int size=alist.size();
        System.out.println("The size of alist is "+size);

        // to access element in array
        int firstElement=alist.get(0);
        System.out.println(firstElement);
        //replacing value of the 1st element
        alist.set(0,120);

        firstElement=alist.get(0);
        System.out.println(firstElement);

        // remove elements
        alist.remove(2);
        // printing list after removal
        System.out.println(alist);


    }
}
