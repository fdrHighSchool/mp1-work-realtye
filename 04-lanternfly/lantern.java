
/**
 * Write a description of class lantern here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class lantern
{
 import java.util.Scanner;

public class Lanternfly
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print(" Boxing is a lonely and harsh sport ");
        System.out.println("It is not about motivatio but rather about discipline.");
        
        System.out.print(" How long have you been training for? ");
        int num = input.nextLine();
        
        if (num < 2) {
            System.out.println("You are still beginning and continue and never give up");
        } // end if statement
        else {
            System.out.println("You may consider becoming pro");
        } // end else statement
        
    } // end main method

} // end class