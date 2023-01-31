package class17;

public class Student {
    String id;
    String name;
    int age;
    double weight;

    //necessary for when using constructors
    Student(String studentID,String studentName, int studentAge,double studentWeight){
        id=studentID;
        name=studentName;
        age=studentAge;
        weight=studentWeight;

    }
    void printInfo(){
        System.out.println("ID: "+id+" Name: "+name+" Age: "+age+" Weight: "+weight);
    }
}
