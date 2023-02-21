package reviewclass8;

public class InsuranceTester {
    public static void main(String[] args) {
        // can I create an Object of insurance class - NO, since it is abstract

        Insurance carPolicy = new CarPolicy("I65656686", "John Smith", 200, 22);
        carPolicy.getInsurance();
        carPolicy.calculateCoverage();
        System.out.println(carPolicy.calculateCoverage());

        Insurance petPolicy = new PetPolicy("P5265", "Olena", 20, 4);
        petPolicy.getInsurance();
        petPolicy.calculateCoverage();
        System.out.println(petPolicy.calculateCoverage());

        Insurance[] insurances ={
               new CarPolicy("I5445", "John Smith", 200, 22),
        new CarPolicy("I5445", "John Smith", 200, 22),
        new PetPolicy("P5445", "Olena", 10, 2),
        new CarPolicy("I5445", "John Smith", 200, 22),

    };
        insurances[0].calculateCoverage();
    }
}
