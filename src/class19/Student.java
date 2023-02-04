package class19;

public class Student {
    String name;
    String address;

    Student(String name, String address){
        this.name=name;
        this.address=address;
    }

    void displayInfo(){
        System.out.println(name+address);
    }

    public static void main(String[] args) {
        Student student=new Student("Mike", "Street");
        student.displayInfo();
    }
}
