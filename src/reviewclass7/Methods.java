package reviewclass7;

public class Methods {
    // user defined: with return type and without(we call them void)
    //            with parameters a
    void hello(){ //method with no parameters
        System.out.println("Hello");
    }
    void sayHello(String name){ // method with parameters
        System.out.println("Hello "+name);
    }

// create a method that finds the largest number between given 2 integer values

    int findLargest(int num1, int num2){
        if(num1>num2){
            return num1;
        }else{
            return num2;
        }
    }

    // create a method that find an average value of 2 decimal values

    double findAverage(double num1, double num2){
        return (num1+num2)/2;
    }

    //methods that returns reverse string from a give string
    StringBuilder printReverse(String str){
        StringBuilder sb=new StringBuilder(str);
        return new StringBuilder(sb.reverse().toString());
    }

    //create a method that will return a minimum value from given array
    public static int minFromArray(int[] array){

        int minimum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minimum) {
                minimum = array[i];
            }
        }
        return minimum;
    }

    public static void main(String[] args) {
        String name="Mohammed";
        int characters=name.length();
        System.out.println(characters);

        Methods obj=new Methods();
        obj.sayHello(name);
        System.out.println(" ----------------------------");
        int largest=obj.findLargest(100,200);
        System.out.println("The largest number is "+largest);

        System.out.println(" ----------------------------");
        System.out.println(obj.findAverage(10,30));

        System.out.println(" ----------------------------");
        StringBuilder reverse=obj.printReverse("Hello");
        System.out.println(reverse);

        String myString="Batch15";

        boolean empty=myString.toUpperCase().isEmpty(); //false

        char character=myString.trim().charAt(2); //t
        System.out.println(character);

        System.out.println(" ----------------------------");
        int [] array={10,49,89,60};
        Methods.minFromArray(array);
        int minimum=minFromArray(array);
       System.out.println("Min number ="+minimum);

    }
}
