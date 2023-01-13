package class6;

import java.util.Scanner;

public class ClassPractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 3 numbers");
        double number1, number2, number3;
        number1 = scan.nextDouble();
        number2 = scan.nextDouble();
        number3 = scan.nextDouble();
        if (number1 > number2 && number1 > number3) {
            System.out.println(number1+" is the largest number");
        }
        if (number2 > number1 && number2 > number3) {
            System.out.println(number2+" is largest number");
        }
        if (number3 > number1 && number3 > number2) {
            System.out.println(number3+" is largest number");
        }
    }
}


