package class28;

import class26.Dog;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericArrayList {
    public static void main(String[] args) {
        //ArrayList<String> name=new ArrayList<>();
        Object a=new String("some value");
        Object b=new Integer(10);
        Object c=new Scanner(System.in);

        // no one now uses the array slike this.
        ArrayList name=new ArrayList();
        name.add("Zafar");
        name.add(10);
        name.add('a');
        name.add(new Dog("Jacky","green", "unknown"));

        for (Object j:name){
            System.out.println(j);
        }
    }
}
