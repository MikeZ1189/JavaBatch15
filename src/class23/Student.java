package class23;
/*
Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
Define common behavior within parent class and override some of the methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism
 */
public class Student {
    public void study(){
        System.out.println("Studying....");
    }
    void doHomeWork(){
        System.out.println("Solving homeworks");
    }
    void practice(){
        System.out.println("practicing the skills");
    }
}
class SyntaxStudent extends Student{
    @Override
    public void study() {
        System.out.println("Syntax student must study programming");
    }

    @Override
    void doHomeWork() {
        System.out.println("Syntax students must solve the homeworks before next class");
    }

    @Override
    void practice() {
        System.out.println("Syntax student must practice replits");
    }
}
class CollegeStudent extends Student{
    @Override
    void practice() {
        System.out.println("College students must practice to get good grades");
    }
}
class SchoolStudent extends Student{


}
 class StudentTester {
    public static void main(String[] args) {

        Student[] students = {new SyntaxStudent(), new CollegeStudent(), new SchoolStudent()};
        for (Student student : students) { // enhanced for loop
            student.doHomeWork();
            student.practice();
            student.study();

        }
    }
}