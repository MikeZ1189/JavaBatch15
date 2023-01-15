package class9;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /*Write a program to ask a user to enter item they want to buy and the price of that item.Every time user enters
        money accumulate the amount and tell the user how much is left to pay off.If user give more money program should
        return a change.Whenever a user done with payments program should say "Thank you for shopping!"
        */
            /*1- ask user for item and price of item
              2- accumulate the price
              3- tell the user how much total that they should pay
              4- if user give more money program should return a change
              5- thank you for shopping!*/
        Scanner scan = new Scanner(System.in);
        double totalPrice = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Please enter item you want to buy and it's price");
            String itemName = scan.next();
            double itemPrice = scan.nextDouble();
            totalPrice= totalPrice + itemPrice;
            System.out.println("This is the total amount that you have to pay " + totalPrice);
        }
        System.out.println("Please pay for the items");
        double amountPaid=scan.nextDouble();

            if(amountPaid>totalPrice){
                double chang=amountPaid-totalPrice; // calculating the change
                System.out.println("Hey here is your change "+chang);
            }else if(amountPaid<totalPrice) {
                System.out.println("You can't buy all the items");
            }
            System.out.println("Thank you for shopping!");
        }
    }

