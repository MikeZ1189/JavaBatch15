package reviewclass3;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        int i = 1;
        while (i <= 4) {
            System.out.println("Hello");
            i++;
        }
        Scanner scan=new Scanner (System.in);
        System.out.println("Are you tired?");
        boolean tired=scan.nextBoolean();
        while (!tired){
            System.out.println("This is great");
            System.out.println("Lets study Java");
            System.out.println("Are you tired?");
            tired=scan.nextBoolean();
            System.out.println();
        }
    }
}

