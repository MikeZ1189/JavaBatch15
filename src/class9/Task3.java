package class9;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /* Write a program that reads a range of integers
            (start and end point), provided by a user and then
    from that range prints the sum of the even and odd integers.
    */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter two numbers starting point and ending point");
        int start=scanner.nextInt();
        int end=scanner.nextInt();

        System.out.println("Start "+start+" End"+end);

        int evenSum=0;
        int oddSum=0;
        for (int i = start; i <= end; i++) {
            //System.out.println(i);
            if(i%2==0){
                evenSum+=i;
                //System.out.println("Even number "+i);
            }else{
                oddSum=oddSum+i;
                //System.out.println("Odd number "+i);
            }
        }
        System.out.println("Sum of all even numbers "+evenSum);
        System.out.println("Sum of all odd numbers "+oddSum);
    }


}
