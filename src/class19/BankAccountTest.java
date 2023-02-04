package class19;

public class BankAccountTest {
    public static void main(String[] args) {
       BankAccount ba=new BankAccount();
       ba.accountNumber=484856445l;
       ba.money=1000;
       ba.deposit();

        System.out.println(ba.accountNumber);
        System.out.println(ba.money);

        //ba.transfer();  methods defined inside child class not available to the parent class

        System.out.println(" -------- Creating an object of the checking account ------");

        Checking check=new Checking();
        //features from parent
        check.accountNumber=5765;
        check.money=780;
        // features from checking class itself (child class)
        check.interest=0;

        check.deposit(); // from parent
        check.transfer(); // from child

        System.out.println(" -------- Creating an object of the Savings account ------");

        Savings save=new Savings();
        save.accountNumber=5556486556456l;
        save.money=7658;
        save.profit=100;
        // save.interest=0; sibling features are not available

        save.deposit();  // from parents
        save.takeProfit(); // from savings
        // save.transfer(); not available

        // finish creating SuperSavings object and see which feature is available to that class  HW
        System.out.println(" -------- Creating an object of the SuperSavings account ------");

        SuperSavings sup=new SuperSavings();
        sup.profit=151545.20;
        sup.takeProfit();
       // sup.interest=1562.50; not available
    }
}
