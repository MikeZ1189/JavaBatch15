package class13;

public class StringRecap {
    public static void main(String[] args) {
        //want to print all the letters from String one by one
        String str="Java is Great";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        // what is the input to the charAt() method is (int)
        System.out.println(" -------------------------- ");
        // count how many times the letter 'a' appears in the String above
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println("Letter a has appeared "+count+" many times");
    }
}
