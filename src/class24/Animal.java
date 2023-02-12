package class24;

public abstract class Animal {
    /*
    define the speak eat methods and create 3 subclasses and override the speak eat methods
     */
    abstract void speak();
    abstract void eat();
    void sleep(){
        System.out.println("Animals sleep 5 to 8 hours");
    }
}
class Dog extends Animal{
    @Override
    void speak() {
        System.out.println("bark bark");
    }

    @Override
    void eat() {
        System.out.println("Dog is eating");
    }
}
class Cat extends Animal{
    @Override
    void speak() {
        System.out.println("meow meow");
    }

    @Override
    void eat() {
        System.out.println("Cat is eating");
    }
}
class Bird extends Animal{
    @Override
    void speak() {
        System.out.println("tweet tweet");
    }

    @Override
    void eat() {
        System.out.println("Bird is eating");
    }
}
