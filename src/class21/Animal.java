package class21;

public class Animal {
    String name;
    String color = "Black";

}

class Cat extends Animal {
    String color = "White";
    int age = 10;
    double weight;

    void printColor() {
        String color = "Blue";
        System.out.println(color); // Blue
        System.out.println(this.color);  //White
        System.out.println(super.color); // Black
    }
}

