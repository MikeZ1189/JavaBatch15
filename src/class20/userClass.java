package class20;

public class userClass {

    String name;
    int mobileNumber;

    userClass(String name, int mobileNumber){
        this.name=name;
        this.mobileNumber=mobileNumber;
    }
}
 class userInfo extends userClass{
    String userAddress;
    userInfo(String name, int mobileNUmber, String userAddress){
        super(name, mobileNUmber);
        this.userAddress=userAddress;
    }
    void userDetails(){
        System.out.println("Name: " +name+" mobile number: "+mobileNumber+" Address: "+userAddress);
    }
}
