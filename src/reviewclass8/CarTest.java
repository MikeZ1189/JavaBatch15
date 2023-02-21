package reviewclass8;

import reviewclass7.Car;
import reviewclass7.Tesla;

public class CarTest {
    public static void main(String[] args) {
        Bmw bmw = new Bmw("BMW", "X7");
        bmw.start();
        System.out.println(  bmw.drive("smooth"));
        bmw.brake(); //come from BMW which is subclass

        Car car=new Car("SomeCar", "SomeModel");
        car.start();
        car.drive(90);

        Tesla tesla=new Tesla("Tesla", "S", 2022, 350, "electric", true);
        tesla.start(); //override method from Tesla class is executed
        tesla.drive(75); // comes from parent class
        tesla.haveAutopilot(); // comes from Tesla class

        //Runtime polymorphism is achieved through method overriding
        //casting: widening and narrowing - used with primitives
        //          upcasting and downcasting - used with non primitives
        Car bmw1=new Bmw("BMW", "X7"); // upcasting
        bmw1.start();
        bmw1.drive(100);
        bmw1.drive("Miami", 120);
    }
}
