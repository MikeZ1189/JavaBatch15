package reviewclass8;

public class Store {
    public static void main(String[] args) {

        Furniture table=new Table();
        table.comfort();
        table.assemble();

        Table t=new Table();
        t.assemble();
        t.comfort();
        t.buildTable("Wood");

        Chair.breaks();
        Furniture.breaks(); // static method called by using class name

        Furniture chair=new Chair(); //upcasting
        chair.assemble();
        chair.comfort(); //runtime polymorphism

        //proof that method breaks is not overriden

        chair.breaks(); // since we are not overriding method breaks will be executed from parent class

    }
}
