package reviewclass4;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //there are 4 types of loops in Java
        //While loop
        // when we do not know how many times we need to repeat a block of code
        // also for do while loops
        // do while loops will run at least once
        int a=1;
        while (a<=3){
            System.out.println("I am in a while loop");
            a++;
        }
        int b=1;
        do {
            System.out.println("do while");
        }while(b>=3);
        // ask student if they understand loops?
        // if they don't --> tell them to practice more
        // if they do --> you're good, move to array concept
        Scanner scan = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Do you understand loops in Java");
             answer = scan.nextLine();
        }while(!answer.equalsIgnoreCase("yes"));
        System.out.println("Great job, let's learn arrays now");
    }
}
