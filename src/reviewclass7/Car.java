package reviewclass7;

public class Car {
    protected String make, model;
    int year, horsePower;


    public Car(String make, String model){ // this is a constructor
        this.make=make;
        this.model=model;
    }
    public Car(String make, String model, int year, int horsePower){
        this(make, model); // this calls constructor
        this.year=year;  // accessing instance variables
        this.horsePower=horsePower;
    }
     public void start(){
        System.out.println(make+" starts");
    }
    public void drive(int speed){
        System.out.println(make+" drives with speed "+speed);
    }
    //same class have 2 or more methods with same name = Method overloading
    /*
    how to implement?

        1. by using different number of the parameters
        2. by using different type of the parameters
        3. by sequence
     */

    protected String drive(String destination){
        System.out.println(make+" drives to "+destination);
        return destination;
    }
    void drive(int speed, String destination){
        System.out.println(make+"drive to "+destination+" with speed = "+speed);
    }
    public void drive(String destination, int speed){
        System.out.println(make+"drive to "+destination+" with speed = "+speed);
    }
    //am I overloading
    /*
    private void drive (int wheel){} --> NO
    by changing access modifiers we are not overloading

     String drive(String destination){ --> NO
        return destination;
        we cannot overload methods by changing its return type.

        In overloading methods signature MUST BE DIFFERENT
        Method signature involved name and parameters only!!!

        In overloading we don't care about return type (can be changed)
        or access modifiers can be changed 
     */


    }

