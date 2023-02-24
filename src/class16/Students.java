package class16;

public class Students {
    /*
    Create a Class called Students
    Create three  variables  Name , ID  and  numberOfStudents
    Create three objects of the Students Class
    Set the value for  studentName , studentID and increment  the numberOfStudents for each object
    Print out  total number of students
     */

    String studentName;
    String studentID;
    static int numberOfStudents;

    public static void main(String[] args) {

        Students students=new Students();
        students.studentName="JOhn";
        students.studentID="123";
        students.numberOfStudents++;

        Students students1=new Students();
        students1.studentName="Mary";
        students1.studentID="456";
        students1.numberOfStudents++;

        Students students2=new Students();
        students2.studentName="Mary";
        students2.studentID="456";
        students2.numberOfStudents++;

            System.out.println("hell"+Students.numberOfStudents);
        }
    }

