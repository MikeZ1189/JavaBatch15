package class15;

public class Task4 {
    /*
    Create a method createEmail(). Based on values of users firstName, lastName and email type,
    your method should return complete email Address. Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com

    return type = String
    name of method = createEmail()l
    parameters = (John, Snow, gmail)
    {
    return
    }

     */
    String createEmail(String firstName, String lastName, String email){
      return firstName.toLowerCase()+lastName.toLowerCase()+"@"+email+".com";
    }
}
