
/**
 * Write a description of class guessgame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class guessgame
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println ("what mode do you want? \nEasy\nMedium\nHard");
        String mode = s.nextLine();
        System.out.println(mode);
        if (mode.equals ("Easy")) {
            System.out.println("easy mode");
        }
        else if(mode == "Medium") {
            System.out.println("medium mode!");
        }
        else {
            System.out.println("hard mode!");
        }
        int mysteryNumber = 5; // place-holder for now
        
        System.out.println(mysteryNumber);
        
        System.out.print("Enter your guess: ");
        int playerGuess = s.nextInt(); 
        
        // if the player guessed incorrectly
        if(playerGuess != mysteryNumber) {
            // if the player guessed too low
            if(playerGuess < mysteryNumber) {
                System.out.println("You were off by " + (mysteryNumber - playerGuess));
            } // end inner if statement
            // if the player didn't guess too low (meaning, incorrect and too high!)
            else {
                System.out.println("You were off by " + (playerGuess - mysteryNumber));
            } // end inner else statement
        } // end outer if statement
        // if the player didn't guess incorrectly (meaning, correct guess)
        else {
            System.out.println("Correct!!!");
        } // end outer else statement
    } // end main method
} // end class