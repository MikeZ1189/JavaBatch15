package class27;

public class BoxingDemo {
    public static void main(String[] args) {
        //we are boxing here, converting a primitive into a wrapper class
        int number=15;
        printData(number);

        Integer f=10; // Autoboxing
        int number2=f; // unboxking
    }
    public static void printData(Integer number){ // autoboxing
        System.out.println(number);
    }
}
