package class11;

public class Example2 {
    public static void main(String[] args) {

        int num1=10;
        int numb2=20;
        // 0 1 1 2



        int[][] matrix = {{10, 20, 30},
                          {45, 55, 66},
                          {30, 40, 20, 10, 25},
        };
        // print odd numbers with the enhanced loop
        for (int[] arr : matrix) {
            for (int number : arr) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}

