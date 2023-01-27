package reviewclass5;

public class ArrayReview {
    public static void main(String[] args) {
        int a = 10;
        int[] arr = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        // System.out.println(arr[2]);
        System.out.println("Size of the array = " + arr.length);

        System.out.println(" ------------------------------- ");
        // to get all the values from the array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int num : arr) {
            System.out.println(num);
        }
        System.out.println(" ------------------------------- ");
        String[] colors = {"black", "white", "red", "purple", "blue"};
        // anytime we have arrays we can use enhanced for loops to retrieve the value
        for (String color : colors) {
            System.out.print(color + " ");
        }
        System.out.println(" ------------------------------- ");
        for (int i = 0; i < colors.length; i++) {
            System.out.print(colors[i] + " ");

        }
        System.out.println(" ------- printing in reverse ------");

            for (int i = colors.length - 1; i >= 0; i--) {
                System.out.println(colors[i]);
            }
        }
    }

