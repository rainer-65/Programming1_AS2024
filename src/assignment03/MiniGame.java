package assignment03;

import java.util.Random;
import java.util.Scanner;

public class MiniGame {
    private static final String[] WORDS = {"dog", "cat", "rabbit", "hamster", "parrot", "turtle", "goldfish", "meow", "fetch", "treats", "bark", "leash"};
    private static Random random = new Random();

    // Game 1: Guessing Number Game
    public int playNumberGuessingGame() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int target = random.nextInt(100) + 1;
        int attempts = 7;

        System.out.println("Guess the number between 1 and 100!");

        for (int i = 1; i <= attempts; i++) {
            System.out.print("Attempt " + i + ": ");
            int guess = scanner.nextInt();
            if (guess == target) {
                System.out.println("Correct! You guessed the number.");
                return 8 - i; // Reward decreases with attempts
            } else if (guess < target) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }
        }

        System.out.println("Out of attempts! The number was: " + target);
        return 0; // No reward
    }

    // Game 2: Word Scramble Game
    public int playWordScrambleGame() {
        Scanner scanner = new Scanner(System.in);
        String word = WORDS[random.nextInt(WORDS.length)];
        char[] scrambled = word.toCharArray();

        // Scramble the word
        for (int i = 0; i < scrambled.length; i++) {
            int j = random.nextInt(scrambled.length);
            char temp = scrambled[i];
            scrambled[i] = scrambled[j];
            scrambled[j] = temp;
        }

        System.out.println("Unscramble the word: " + new String(scrambled));

        for (int attempt = 1; attempt <= 3; attempt++) {
            System.out.print("Attempt " + attempt + ": ");
            String guess = scanner.next();

            if (guess.equals(word)) {
                System.out.println("Correct! You unscrambled the word.");
                return 4 - attempt; // Reward decreases with attempts
            }
        }

        System.out.println("Out of attempts! The word was: " + word);
        return 0; // No reward
    }

    // Game 3: Guessing multiplication of numbers
    public int playMultiplicationGuessGame() {
        // Generate two random integers between 1 and 100
        int num1 = random.nextInt(1, 101);
        int num2 = random.nextInt(1, 101);
        int correctAnswer = num1 * num2;

        // Display the problem to the user
        System.out.println("Two numbers have been chosen between 1 and 100.");
        System.out.println("What is the product of " + num1 + " and " + num2 + "?");
        System.out.println("You have 15 seconds to guess!");

        // Record the start time
        long startTime = System.currentTimeMillis();

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter your guess: ");
        if (scanner.hasNextInt()) {
            int userGuess = scanner.nextInt();

            // Record the end time
            long endTime = System.currentTimeMillis();

            // Calculate elapsed time in seconds
            double elapsedTime = (double) (endTime - startTime) / 1000;

            // Statistics
            System.out.println("Time used in sec: " + String.format("%.2f", elapsedTime));

            // Check if time limit exceeded
            if (elapsedTime > 15) {
                System.out.println("Result: Time's up! You took too long.");
                return 0;   // No reward
            }

            // Check if the guess is correct
            if (userGuess == correctAnswer) {
                System.out.println("Result: Congratulations! You guessed correctly.");
                return 5;   // Reward
            } else {
                System.out.println("Result: Sorry, that's incorrect. The correct answer was " + correctAnswer + ".");
                return 0;   // No reward
            }
        } else {
            System.out.println("Result: Invalid input! The correct answer was " + correctAnswer + ".");
            return 0;
        }
    }

}
