import java.util.Random;
import java.util.Scanner;

public class Game {



    // method to return a random number
    public static int randomnumber() {

        Random randomnum = new Random();

        int randomnumber = randomnum.nextInt(100) + 1;

        return randomnumber;
    }

    // game itself
    public void rungame(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Hey lets play a guessing game");

        // store next player input as a int
        int playerGuess = scan.nextInt();

        //call randomnumber method to get random number



    }











}
