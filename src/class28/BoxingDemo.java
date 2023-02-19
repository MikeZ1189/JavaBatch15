package class28;

import java.util.ArrayList;

public class BoxingDemo {
    public static void main(String[] args) {
        Integer integer = new Integer(10);
        int number=integer; // this is auto unboxing
        int number2=integer.intValue();  // unboxing

        double d=12.3;
        Double wrapperD=new Double(d); // this is the manual way of boxing
        Double wrapperP=d; // this part is called autoBoxing

        Float f=12f;
        ArrayList<Float>arrayList=new ArrayList<>();
        arrayList.add(12f);

        double fg=12;


    }
}
