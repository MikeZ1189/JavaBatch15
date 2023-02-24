package class19;

public class Teacher {
    String name;
    int teacherId;
    String subject;


    Teacher(String name, int teacherId){ // constructors with parameters
        this.name=name;
        this.teacherId=teacherId;
    }

    Teacher(String name, int teacherId, String subject){ // constructors with parameters
        this(name, teacherId);
        this.subject=subject;
    }


}
