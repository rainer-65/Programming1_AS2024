package lecture06.exercises;

import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        int number;

        // Use a do-while loop to ask for a positive number
        do {
            System.out.print("Please enter a positive number: ");
            number = scanner.nextInt();  // Read the user's input

            if (number <= 0) {
                System.out.println("That's not a positive number. Try again.");
            }
        } while (number <= 0);  // Repeat as long as the number is not positive

        System.out.println("Thank you! You entered a positive number: " + number);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}

