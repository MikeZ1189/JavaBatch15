package class20;

public class Sport {
    String name; // instance variables
    String country;

    Sport(String name, String country){ //constructor with parameters
        this.name=name;
        this.country=country;
    }

    public void display(){  // method
        System.out.println(name+" is played in "+country);
    }
}

class Cricket extends Sport{
    String helmet;

    Cricket(String name, String country, String helmet){ //subclass constructor
        super(name, country); // makes a call to the immediate super class constructor
        //super() - ALWAYS must be on the first line
        this.helmet=helmet;
    }
}

class Soccer extends Sport{
String team;
int numberOfPlayers;
    Soccer(String name, String country,String team, int numberOfPlayers) {
        super(name, country);
        this.team=team;
        this.numberOfPlayers=numberOfPlayers;
    }
    void displayTeam(){
        System.out.println(team+" consist of "+numberOfPlayers+" players");
    }
}
