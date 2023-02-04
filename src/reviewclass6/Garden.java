package reviewclass6;

public class Garden {
    void hello(){
        String name="Adem"; // local variable
        System.out.println("Hello "+name);
    }

    public static void main(String[] args) {

        //static String str; cannot use static for local variables

        // accessing variables of Flower class
        // System.out.println(name); error: since variable name is not within block of code

        Flower flower1=new Flower(); // flower1 is the variable name, new Flower(); is the object
        System.out.println(Flower.pretty);
        flower1.name="Hibiscus";
        flower1.color="red";
        flower1.price=5;
        flower1.pretty=false; // not the right way to access static variable but it is possible
        System.out.println("HIbiscus pretty? "+flower1.pretty);
        System.out.println(flower1.price);
        //flower1.size= error - since variable size does not exist in Flower class

        // accessing methods of Flower class
        flower1.bloom();
        flower1.grow();
        flower1.smell();

        System.out.println("Creating second object of the Flower class");
        Flower flower2=new Flower();
        System.out.println("Roser are pretty? "+flower2.pretty);
        flower2.name="Rose";
        flower2.color="blue";
        flower2.price=15;
        flower2.price=18;
        System.out.println(flower2.price);

        flower2.bloom();
        flower2.grow();
        flower2.smell();

        Flower flower3=new Flower();
        // variable i - is a local to it's block of code - loop
        for (int i = 1; i <=3; i++) {
            System.out.println(i);
        }
        //System.out.println(i); error - since i is not visible outside of loop {}
    }
}
