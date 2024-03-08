import java.util.Random;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        Random rando = new Random();
        Scanner scanner = new Scanner(System.in);

        // make a random number gen and store it to a var
        int randomNumber = rando.nextInt(100)+1;

        System.out.println("Hey! lets play a number guessing game from 1-100");

        //make a count for number of attemps
        int playerAttempts =0;

        //take userinput and store it as in a int var
        while(true){
            // store next input as playerGuess
            int playerGuess = scanner.nextInt();

            // number of attemps counted
            playerAttempts++;

            // if guess is = to randomnumber
            if(playerGuess == randomNumber){
                System.out.println("Wow Nice guess you win!");
                System.out.println("wow only " + playerAttempts + " attempts");
                break;
            }
            // if  guess is higher than randomnumber
            else if(randomNumber < playerGuess){
                System.out.println("too high lower");
            }

            //if guess is lower than randomnumber
            else {
                System.out.println("too low higher");
            }
        }



    }
}
