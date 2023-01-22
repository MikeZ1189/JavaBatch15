package class12;

import java.sql.SQLOutput;

public class StringDemo2 {
    public static void main(String[] args) {
        String str="JAVA is FUN";
        String newStr=str.toLowerCase(); // only converts upper case letters to lower case
        System.out.println(newStr);

        String str2="i love java";
        String newStr2=str2.toUpperCase(); // only converts lower case letters to upper case
        System.out.println(newStr2);
    }
}
