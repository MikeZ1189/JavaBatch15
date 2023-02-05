package class20;

public class SuperClass {  // this is a constructor with no parameters

    SuperClass() {
        System.out.println("I am a constructor from the parent class");
    }
}

class SubClass extends SuperClass {
    SubClass() {
       // super();// makes a call to the parent class constructor
        System.out.println("I am a child constructor");
    }
}
