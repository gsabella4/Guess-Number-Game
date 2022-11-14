import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        int randomNumber = new Random().nextInt(100)+1;
        Scanner userInput = new Scanner(System.in);
        int guessAttempts = 6;
        System.out.println("\n\t\t\tHello there! Let's play a guessing game :)");
        System.out.println("\nLet's see if you can guess the random number... in 6 attempts or less!");
        System.out.println("\n☆彡･:*:･★彡･:*:･☆彡･:*:･★彡･:*:･☆彡･:*:･★彡☆彡･:*:･★彡･:*:･☆彡･:*:･★彡･:*");

        while(guessAttempts > 0){
            System.out.print("\nGuess a number between 1 and 100: ");
            String input = userInput.nextLine();
            int inputNumber = Integer.parseInt(input);

            if(inputNumber == randomNumber){
                System.out.println("\nYou guessed correctly! Let's Go!");
                System.exit(0);
            }
            else if (inputNumber > randomNumber){
                guessAttempts--;
                System.out.println("\n\t\tThat's too high!");
            }
            else if (inputNumber < randomNumber){
                guessAttempts--;
                System.out.println("\n\t\tThat's too low!");
            }
        }
        System.out.println("\n\n・‥…━━━☆・‥…━━━☆・‥…━━━☆・‥…━━━☆・‥…━━━☆・‥…━━━☆・");
        System.out.println("\n\t\tYikes! Better luck next time.");
        System.out.println("\n\t\t\tThe right number was " + randomNumber);
    }
}
