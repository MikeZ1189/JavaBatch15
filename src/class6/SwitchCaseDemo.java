package class6;

public class SwitchCaseDemo {
    public static void main(String[] args) {

        String country="USA";
        System.out.println(country.toLowerCase());
        switch (country.toLowerCase()){
            case "usa":
                System.out.println("Burgers");
                break;
            case "italy":
                System.out.println("Pasta");
                break;
            case "afgahnishtan":
                System.out.println("Kebab");
                break;
            default:
                System.out.println("wrong country");
        }
    }
}
