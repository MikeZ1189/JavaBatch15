package class15;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MethodPractice {
    // create a method which returns true or false and takes int numbers as a parameter if number is even
    // it returns true otherwise it returns false

    boolean isEven(int num, int num2, int num3) {
        boolean flag;
        if (num % 2 == 0) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }

    boolean isEven1(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    boolean isEven2(int num) {
        return num%2==0;
    }
}
