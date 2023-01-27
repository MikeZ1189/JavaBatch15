package reviewclass5;

public class Task8 {
    public static void main(String[] args) {
        // write a jave program to print the first 10 numbers of fivonnachi numbers
        int a=0;
        int b=1;
        int c;
        for (int i = 1; i < 10; i++) {
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;

        }
    }
}
