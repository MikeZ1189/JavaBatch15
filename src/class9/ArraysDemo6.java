package class9;

public class ArraysDemo6 {
    public static void main(String[] args) {
        // create an empty array then store 45 44 33 20 and 10 in it then use a loop
        // to add all the elements which are present in even indexes and print it

        // create an array and store 10 20 30 4 5 6 7 80
        // add all the elements which are multiple of 2

        int[] numbers = new int[5]; //an empty array of size 5 will be created
        numbers[0] = 45;//45+0
        numbers[1] = 44;
        numbers[2] = 33;//45+33=78
        numbers[3] = 20;
        numbers[4] = 10;//45+33+10=88
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                sum = sum + numbers[i];
            }
        }
        System.out.println(sum);


        System.out.println("------------------");


        int[] numbers2 = {10, 20, 30, 4, 5, 6, 7, 80};
        int sum2 = 0;
        for (int j = 0; j < numbers2.length; j++) {
            if (numbers2[j] % 2 == 0) {
                sum2 = sum2 + numbers2[j];
            }
        }
        System.out.println(sum2);

    }
}




