
/**
 * Write a description of class username here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class UserName {
  public static void main(String[] args) {
    // create Scanner object
    Scanner s = new Scanner(System.in);

    // get String input from user
    System.out.print("Are you a teacher or a student?");
    //set role 
    String role = s.nextLine();
    System.out.print("Enter your first name: ");
    String firstName = s.nextLine();
    System.out.print("Enter your last name: ");
    String lastName = s.nextLine();
    System.out.print("What is you're favorite number 1 through 15?");
    String number = s.nextLine(); // convert to int
    //System.out.print("@gmail.com");
    //String email = s.nextLine();
    if(role.equals("Student")) {
        // do something
    System.out.print("firstName" + "lastName" + "number");
        //print firstname,first letter lastname, favoritenumebr, + "@nycstudents.net"
    }
    else if (role.equals("Teacher")) {
        // do something else
    }
    
    // test output
    //System.out.println("Hello " + initialize(firstName) + "." + initialize(lastName) + "."
    //+ initialize(number) +"." + initialize(email) + ".");

    s.close();
  } // end main method

  /*
   * Name: initialize
   * Purpose: send back the first character (inital) of a name
   * Input: a name (String)
   * Return: a single character (String)
   */
  public static String initialize(String n) {
    return n.substring(0, 1);
  } // end initialize method

} // end class
