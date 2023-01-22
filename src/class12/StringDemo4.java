package class12;

public class StringDemo4 {
    public static void main(String[] args) {
        String str="   ";
        boolean isEmpty=str.isEmpty();
        System.out.println(isEmpty); //this counts spaces so it will be false bc of the spaces entered

        //System.out.println(str.isEmpty()); //this is a boolean method
        System.out.println(str.isBlank()); //this will not count for spaces
    }
}
