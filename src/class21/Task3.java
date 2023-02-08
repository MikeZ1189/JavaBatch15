package class21;

/*
    Create 1 class with a static method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
    Create 1 class with a private method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
        */
public class Task3 {
    private void method(String str1) {
        System.out.println("Method with one String");
    }

    private void method(String str1, String str2) {
        System.out.println("Method with two Strings");
    }

    private void method(String str1, String str2, String str3) {
        System.out.println("Method with three Strings");
    }

    public static void main(String[] args) {
Task3 task3=new Task3();

        task3.method("One");
        task3.method("One", "Two");
        task3.method("One", "Two", "Three");
    }
}
