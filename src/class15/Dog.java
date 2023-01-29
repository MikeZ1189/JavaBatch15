package class15;

public class Dog {

    String name; // not local variable but instance variable
    String breed; // not local variable but instance variable
    String color; // not local variable but instance variable


    static int  noOfLegs=4;  // static variable


    void printFood() {  // local variable
        String food = "Meat";
        System.out.println(food);

    }
    void printColor(){
        //System.out.println(food);
        System.out.println(name);
    }
}
