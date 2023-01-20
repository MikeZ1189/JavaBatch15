package reviewclass4;

public class NestedLoops {
    public static void main(String[] args) {
        // nested loop - loop inside another loop
        for (int i = 1; i <=3; i++) { //outer loop
            System.out.println(i);
            for (int j = 1; j <=4 ; j++) { //inner loop
                System.out.println(j);
            }
        }
        System.out.println(" ------------------ ");
        
        for (int i = 1; i <5 ; i++) {
            System.out.println("Hello");
            for (int j = 1; j <=2 ; j++) {
                System.out.println("Bye");
            }

        }
    }

}
