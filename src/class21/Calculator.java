package class21;

public class Calculator {
    void add(int num1, int num2) {
        System.out.println(num1 + num2);
    }
    void add(int num1, double num2) {  // changed data type
        System.out.println(num1 + num2);
    }
    void add(double num2, int num1) {   // changed the sequence
        System.out.println(num1 + num2);
    }
    void add(int num1, int num2, int num3) {  // changed the number of parameters
        System.out.println(num1 + num2 + num3);
    }
}
