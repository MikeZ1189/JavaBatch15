package class16;

public class SyntaxEmployee {
    /*
    Create a Class called SyntaxEmployee:
Create three  variables  empID , salary and set the CEO to “Sumair”
Create two objects of the class SyntaxEmployee
Set the value of eID, salary for each of the objects
Print out the eID , salary and  CEO for each of the objects
     */

    String empId; //need to be instance variable because they will be different
    double salary; // instance again
    static String CEO = "Sumair"; // this is static because the ceo does not change, it will be the same

    public static void main(String[] args) {

        SyntaxEmployee emp1 = new SyntaxEmployee();
        emp1.empId = "S123";
        emp1.salary = 120000;

        SyntaxEmployee emp2 = new SyntaxEmployee();
        emp2.empId = "S456";
        emp2.salary = 50000;

        System.out.println(emp1.empId);
        System.out.println(emp1.salary); //another way
        System.out.println(emp1.CEO);
    }
}



