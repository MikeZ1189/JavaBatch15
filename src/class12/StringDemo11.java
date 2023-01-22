package class12;

public class StringDemo11 {
    public static void main(String[] args) {
        //send method
        String str="Send it to support channel. More Java";
        String newStr=str.substring(28);
        System.out.println(newStr);
        // we can specify the starting index and ending index
        System.out.println(str.substring(0,27));
    }
}
