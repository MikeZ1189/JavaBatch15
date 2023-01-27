package reviewclass5;

public class Task7 {
    public static void main(String[] args) {
        /*
        write a java program to check whether a give number is prime or not?
        1. number >1
        2. numbers should be divisible only by itself
            2(1,2), 3(1,3), 4(1,2,4),
        */
        int given=6;
        boolean isPrime=true;
        if (given>1){
            for (int i = 2; i <given; i++) {
                if(given%i==0){
                    isPrime=false;
                    break;
                }
            }
        }else{
           isPrime=false;
        }
        System.out.println("Given numbers "+given+" is Prime? " +isPrime);
    }
}
