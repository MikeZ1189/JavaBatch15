package class16;

public class Task4 {
    /*
    Create a method that will say Hello in different language based on the country
    that will passed when method is executed

    return type = String or Void
    name of method = sayHello
    parameters = String contryName

     */

        String sayHello(String countryName) {
            switch (countryName){
                case "USA":
                    return "Hello"; // break is not needed when we use the return keyword, both do the same thing
                case "Kazakhstan":
                    return "Salem";
                case "Italy":
                    return "Ciao";
                case "China":
                    return "Ni hao";
                default:
                    return "Country not supported";
        }
    }

    public static void main(String[] args) {
        Task4 task4=new Task4();
        System.out.println(task4.sayHello("USA"));
    }
}
