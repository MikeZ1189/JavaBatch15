package class17;

public class StudentTester{
    public static void main(String[] args) {
        Student Abdul=new Student("A123","Abdul",32,100 );
        Abdul.printInfo();
        Student Alaa=new Student("A456","Alaa",33,100.5 );
        Alaa.printInfo();
        Student Cahit=new Student("C789","Cahit",34,110.2 );
        Cahit.printInfo();
        Student Fizzy=new Student("F123","Fizzy",35,90.5 );
        Fizzy.printInfo();
        Student Zahra=new Student("Z123","Zahra",30,90.5);
        Zahra.printInfo();
    }
}

/*
// this is how is done without constructors
Student student=new Student();
        student.name="Isabelle";
        student.field="IT";
        student.id="123";
        student.age=27;
        student.weight=165.5;

        Student student1=new Student();
        student1.name="Mateo";
        student1.field="IT";
        student1.id="456";
        student1.age=28;
        student1.weight=175.5;

        Student student2=new Student();
        student2.name="Jorge";
        student2.field="IT";
        student2.id="789";
        student2.age=33;
        student2.weight=200.5;

        Student student3=new Student();
        student3.name="David";
        student3.field="IT";
        student3.id="1231";
        student3.age=29;
        student3.weight=185.5;

        Student student4=new Student();
        student4.name="Marcela";
        student4.field="IT";
        student4.id="1232";
        student4.age=24;
        student4.weight=145.5;
 */