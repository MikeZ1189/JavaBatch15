package class16;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Student {
    String name;
    String id;
    static String schoolName;
    int age;
    double weight;

    void printName(){
        int SSN=123456789;
    System.out.println(name);
    System.out.println(schoolName);
}

    static void printStudentInfo(){
    //System.out.println(name); can't access here
            System.out.println(schoolName);
            }
            }
