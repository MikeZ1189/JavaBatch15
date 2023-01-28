package class15;

public class MPractice4 {
    /*
    create a method that takes two numbers as parameters and return the larger number

    return type = int
    name of method = largerNumber
    parameters = int a, int b
    {
    if
    }
     */
    int largerNumber(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
        public static void main (String[] args){
            MPractice4 mp=new MPractice4();
            System.out.println(mp.largerNumber(12,13));
        }
    }

