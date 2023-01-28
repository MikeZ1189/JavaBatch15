package class15;

import java.util.Scanner;

public class MethodsDemo1 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a number");
        int num=scanner.nextInt(); // calling a method in this line, waiting for an input

        System.out.println("You entered "+num);

        Methods methods=new Methods();
       // methods.doSomeThing();
        // int num2=methods.doSomeThing();
        char c= methods.method2();
    }
}
