import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1; // Generates a random number between 1 and 100
        int userGuess = 0;

        System.out.println("Guess the number (between 1 and 100):");

        while (userGuess != numberToGuess) {
            userGuess = scanner.nextInt();

            if (userGuess < numberToGuess) {
                System.out.println("Too low, try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high, try again.");
            } else {
                System.out.println("Congratulations! You guessed the number.");
            }
        }

        scanner.close();
    }
}
