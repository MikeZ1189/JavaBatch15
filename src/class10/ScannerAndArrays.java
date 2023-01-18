package class10;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerAndArrays {
    public static void main(String[] args) {

        Scanner scanner=new Scanner (System.in);
        System.out.println("Please enter 5 numbers");
        int [] numbers=new int[5];
// below code manually store numbers in the array
       /* numbers [0]=40;
        numbers [1]=50;
        numbers [2]=60;
        numbers [3]=70;
        numbers [4]=80;*/

        // below code takes the numbers from user and store them in the array is good but a lot of code
       /* numbers [0]=scanner.nextInt();
        numbers [1]=scanner.nextInt();
        numbers [2]=scanner.nextInt();
        numbers [3]=scanner.nextInt();
        numbers [4]=scanner.nextInt();*/

        // below code uses a normal for loop to ask the user for numbers and store them in the array
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=scanner.nextInt();
        }

        System.out.println(Arrays.toString(numbers));
    }
}
