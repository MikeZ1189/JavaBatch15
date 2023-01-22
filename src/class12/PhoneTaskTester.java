package class12;

public class PhoneTaskTester {
    public static void main(String[] args) {
        Phone phone1=new Phone();
        phone1.brand="Iphone";
        phone1.color="Gold";
        phone1.price=1500 ;
        phone1.version=11 ;
        phone1.storage= 256;
        phone1.isUnlocked=true;

        Phone phone2=new Phone();
        phone2.brand="Pixel";
        phone2.color="black";
        phone2.price=900 ;
        phone2.version=7 ;
        phone2.storage=512 ;
        phone2.isUnlocked=false;
        phone2.sendingMessages();


        Phone phone3=new Phone();
        phone3.brand="Samsung ";
        phone3.color="Silver";
        phone3.price=700 ;
        phone3.version=9;
        phone3.storage=64 ;
        phone3.isUnlocked=false;
        phone3.ringing();

    }
}
