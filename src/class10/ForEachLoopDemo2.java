package class10;

import org.w3c.dom.ls.LSOutput;

public class ForEachLoopDemo2 {
    public static void main(String[] args) {
// print all odd numbers from this array
        int[] arr = {10, 13, 20, 25, 45, 50};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i]);
            }
        }
        // replace all the odd numbers in this array with the help of a normal loop
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 != 0) {
                arr[i] = 0;
            }
    }
                System.out.println("After replacing all odd numbers with zeros");
                for (int i = 0; i < arr.length; i++) {

        System.out.println(arr[i]);

        }
}
    }

