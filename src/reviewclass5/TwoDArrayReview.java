package reviewclass5;

public class TwoDArrayReview {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {11, 12, 13},
                {20, 21, 22},
                {100, 101}
        };
        int numberOfArrays = array.length;
        System.out.println(numberOfArrays);

        int numberOfElementsIn1Array = array[0].length;
        System.out.println(numberOfElementsIn1Array);

        int numberOfElementsIn4Array=array[3].length;
        System.out.println(numberOfElementsIn4Array);

        //access #21
        System.out.println(array[2][1]);

        //getting all values from 2d array
        int[][] array2 = {
                {1, 2, 3},
                {11, 12, 13},
                {20, 21, 22},
                {100, 101}
        };
        // getting all values using enhanced for loop
        for (int [] arr:array2){ // iterates over arrays
            for (int num:arr) { // iterates over each element
                if (num % 2 == 0) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
        }

        int[][] array3 = {
                {1, 2, 3},
                {11, 12, 13},
                {20, 21, 22},
                {100, 101}
        };
        // getting all values from 2D array using regular for loop
        for (int row = 0; row < array3.length; row++) { // outer loop iterates over rows
            for (int col=0; col<array3[row].length; col++) { // iterates over each column
                // I want to print values only from odd rows
                if (row % 2 != 0) {
                    System.out.print(array3[row][col] + " ");
                }
            }
            System.out.println();
        }
        System.out.println(" ---------------------- ");
    }
}
