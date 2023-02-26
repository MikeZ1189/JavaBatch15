package class29;

import java.util.ArrayList;

/*
Create an arraylist of cars and retrieve all the values using 3 different ways.
 */
public class Task2 {
    public static void main(String[] args) {

        ArrayList<String> cars=new ArrayList<>();
        cars.add("BMW Xi");
        cars.add("Tesla Y");
        cars.add("Fx");

        System.out.println(cars);

        for (String car : cars) {
            System.out.println(cars);
        }

        for (int i = 0; i < cars.size(); i++) {
            String car = cars.get(i);
            System.out.println(car);
        }
    }
}
