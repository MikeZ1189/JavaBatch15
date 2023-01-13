package class6;

public class WhileLoop6 {
    public static void main(String[] args) {
        //while (true){
        // System.out.println("Hello World");
           /* boolean condition=true;
            int number=0;
            while (condition){
                System.out.println("Hello World");
                if (number>3){
                condition=false;}
                number++;*/

        int number = 0;
        while (number < 10) {

            if (number % 2 == 0) {
                System.out.println("Even " + number);
            }
            number++;
        }
    }
}
