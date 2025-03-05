import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String playAgain;
        int totalAttempts = 0;
        int roundsWon = 0;
        int totalRounds = 0;

        do {
            int numberToGuess = random.nextInt(100) + 1; // Generates a random number between 1 and 100
            int userGuess = 0;
            int maxAttempts = 5; // Limit the number of attempts
            int attempts = 0;
            totalRounds++;

            System.out.println("Guess the number (between 1 and 100):");

            while (attempts < maxAttempts && userGuess != numberToGuess) {
                userGuess = scanner.nextInt();
                attempts++;

                if (userGuess < numberToGuess) {
                    System.out.println("Too low, try again.");
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too high, try again.");
                } else {
                    System.out.println("Congratulations! You guessed the number.");
                    roundsWon++;
                    break;
                }
            }

            totalAttempts += attempts;

            if (userGuess != numberToGuess) {
                System.out.println("Sorry, you've used all your attempts. The number was: " + numberToGuess);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.next();
            
            System.out.println("Your Score:");
            System.out.println("Total Rounds Played: " + totalRounds);
            System.out.println("Rounds Won: " + roundsWon);
            System.out.println("Total Attempts: " + totalAttempts);

        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}