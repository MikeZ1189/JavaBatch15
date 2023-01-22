package class12;

public class StringDemo7 {
    public static void main(String[] args) {
        String str="I love java";
        boolean startWith=str.startsWith("I");
        System.out.println(startWith);
        System.out.println(str.endsWith("java"));

        // method chaining is when multiple methods are called on the same line
        // only those methods can be chained which returns a String
        System.out.println(str.toLowerCase().startsWith("i"));
        //System.out.println(str.length().startsWith("i"));

        System.out.println(str.contains("java"));
    }
}
