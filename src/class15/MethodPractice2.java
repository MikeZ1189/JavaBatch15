package class15;

public class MethodPractice2 {
    //Create a method that takes a String reverse it and return the reversed String.
    // call the method reverseStr

    // return String
    // parameter = String
    // name of method = reverseStr
    String reverseStr(String input) {
        String newStr = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            newStr += input.charAt(i);
        }
        return newStr;
    }

    String reverseStr1(String input) {
        return new StringBuilder(input).reverse().toString();
    }
    String reverseSt2(String input){
        StringBuilder stringBuilder=new StringBuilder(input);
        stringBuilder.reverse();
        return stringBuilder.toString();
}
}
