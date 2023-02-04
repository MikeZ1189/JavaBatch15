package reviewclass6;

public class StrBuilderExample {
    public static void main(String[] args) {
        // this class is mutable collection of characters
        StringBuilder sb=new StringBuilder("Hello");
        // all changes happens on the same object
    sb.reverse(); // proves that StringBuilder is mutable

        System.out.println(sb);

        String str=sb.toString();
        str.toUpperCase(); // proves that String is immutable
        System.out.println(str); //olleH
    }
}
