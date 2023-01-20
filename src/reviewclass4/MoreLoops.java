package reviewclass4;

public class MoreLoops {
    public static void main(String[] args) {

        for (int i = 0; i <= 3; i++) {
            System.out.println(i);
            for (int j = 1; j >= 3; j++) {
                System.out.println(j);

            }
        }
        System.out.println("---------------------");
        for (int i = 0; i <= 3; i++) {

            for (int j = 1; j <= 3; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println("----------CAR-----------");
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <=9; k++) {
                    for (int l = 0; l <=9; l++) {
                        System.out.println(i+" "+j+" "+k+" "+l+" ");
                    }
                }
            }
            System.out.println();
        }
        System.out.println("----------CLOCK-----------");
        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 60; j++) {

                        System.out.println(i+" : "+j);
                    }

            }
            System.out.println();
    }
}
