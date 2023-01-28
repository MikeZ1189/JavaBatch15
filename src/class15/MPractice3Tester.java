package class15;

public class MPractice3Tester {
    public static void main(String[] args) {

        /*
        create the object of the calss that hass the method
        objectname.methodname
         */

        MPractice3 mp=new MPractice3();
        int [] array={10,20,30};
        System.out.println(mp.arraySum(array));

        System.out.println(mp.arraySum(new int[]{10,10,10}));
    }
}

