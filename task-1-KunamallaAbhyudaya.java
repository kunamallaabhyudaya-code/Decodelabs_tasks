import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int secretNumber = random.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100.");

        do {
            System.out.print("Enter your guess: ");

            while (!sc.hasNextInt()) {
                System.out.println("Please enter a valid number!");
                sc.next();
                System.out.print("Enter your guess: ");
            }

            guess = sc.nextInt();
            attempts++;

            if (guess > secretNumber) {
                System.out.println("Too High!");
            } else if (guess < secretNumber) {
                System.out.println("Too Low!");
            } else {
                System.out.println("Correct! You guessed the number.");
                System.out.println("Attempts taken: " + attempts);
            }

        } while (guess != secretNumber);

        sc.close();
    }
}