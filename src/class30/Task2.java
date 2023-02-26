package class30;

import java.util.HashSet;
import java.util.Set;

/*
Create a Set collection that will hold Objects of Student Type.
In this set we do not care about the insertion order.
Each student object should have name and studentID. Display name of each student.
 */
public class Task2 {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student("Maria", 2324));
        students.add(new Student("Anna", 8993));
        students.add(new Student("Peter", 3245));
        students.add(new Student("Remi", 4329));
        students.add(new Student("Blair", 3421));
        for (Student everyName : students) {
            System.out.println(everyName.getName());
        }
    }
}

    class Student {
        private String name;
        private int studentID;

        public Student(String name, int studentID) {
            this.name = name;
            this.studentID = studentID;
        }

        public String getName() {
            return name;
        }
        }



