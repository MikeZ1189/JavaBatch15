package class19;

public class Donkey {
    // these are variables
    String name;
    int age;
    double weight;

    // these are the methods


   /* Donkey(){
        System.out.println("This is non argument constructor");
    }*/

    // applying parameters
Donkey(String donName, int donAge){
    name=donName;
    age=donAge;
}
    void print(){

    System.out.println("Donkey's name is "+name+" age is "+age+" and weight is "+weight);
    }
}
