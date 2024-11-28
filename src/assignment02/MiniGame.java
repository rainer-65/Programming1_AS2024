package assignment02;

import java.util.Random;
import java.util.Scanner;

public class MiniGame {
    private static final String[] WORDS = {"dog", "cat", "rabbit", "hamster", "parrot", "turtle", "goldfish", "meow", "fetch", "treats", "bark", "leash"};
    private static Random random = new Random();

    // Game 1: Guessing Number Game
    public int playNumberGuessingGame() {

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


}

