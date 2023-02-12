package class24;

public abstract class Phone {
    /*
    create a phone class, lets create abstract methods like:
    displayPictures
    unlockPhone
    SendText

    2 child classes (iPhone Samsung Google) and provide specific implementation
    then write code to achieve runtime polymorphism
     */
    abstract void displayPictures();
    abstract void unlockPhone();
    abstract void sendText();
}

class iPhone extends Phone{
    @Override
    void displayPictures() {
        System.out.println("iPhotos to browse pictures on iPhone");
    }
    @Override
    void unlockPhone() {
        System.out.println("FaceId to unlock iPhone");
    }
    @Override
    void sendText() {
        System.out.println("iMessage to send text on iPhone");
    }
}
class Samsung extends Phone{
    @Override
    void displayPictures() {
        System.out.println("Gallery to browse pictures on Samsung");
    }

    @Override
    void unlockPhone() {
        System.out.println("FingerPrint to unlock Samsung");
    }

    @Override
    void sendText() {
        System.out.println("Messages to send text on Samsung");
    }
}
class Google extends Phone{
    @Override
    void displayPictures() {
        System.out.println("Displaying picture on Google");
    }

    @Override
    void unlockPhone() {
        System.out.println("Unlocking Google");
    }

    @Override
    void sendText() {
        System.out.println("Sending text on Google");
    }
}
class PhoneTester{
    public static void main(String[] args) {

        Phone[] p = {new iPhone(), new Samsung(), new Google()};
        for(Phone phone: p){
            phone.unlockPhone();
            phone.sendText();
            phone.displayPictures();
        }
    }
}