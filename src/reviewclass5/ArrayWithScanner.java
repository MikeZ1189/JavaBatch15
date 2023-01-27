package reviewclass5;

import java.util.Scanner;

public class ArrayWithScanner {
    public static void main(String[] args) {
        // let's create an array of names using Scanner
        Scanner scan=new Scanner (System.in);
        System.out.println("How many names you want to store?");
        int size=scan.nextInt();
        String [] name=new String[size]; // we are creating an array based on the size the user input
        for (int i = 0; i < name.length; i++) {
            System.out.println("Please enter names");
            name[i]=scan.next();
        }
        // using loop below we can retrieve elements
        // enhanced for loop work with variable
        for(String names:name) {
            System.out.println(names);
        }
    }
}
