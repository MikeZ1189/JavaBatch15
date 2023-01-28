package class15;

public class MethodPracticeTester {
    public static void main(String[] args) {
       MethodPractice mp=new MethodPractice();
        boolean checkEven=mp.isEven1(15);
        System.out.println(checkEven);

        // call iseven method for the numbers 100 12 20
        MethodPractice check=new MethodPractice();
        boolean checkEven2=check.isEven(100,12, 20);
        System.out.println(checkEven2);

       /* boolean isEven=check.isEven(100);
        System.out.println(isEven);*/

    }
}
