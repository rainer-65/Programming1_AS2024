package lecture06.exercises;

import java.util.Scanner;

public class FavoriteColor {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for their favorite color
        System.out.print("What is your favorite color? ");
        String color = scanner.nextLine().toLowerCase();

        // Using if-else statements to print a message based on the color
        if (color.equals("blue")) {
            System.out.println("Your favorite color is blue!");
        } else if (color.equals("red")) {
            System.out.println("Your favorite color is red!");
        } else if (color.equals("green")) {
            System.out.println("Your favorite color is green!");
        } else if (color.equals("yellow")) {
            System.out.println("Your favorite color is yellow!");
        } else {
            System.out.println("Other color chosen ...");
        }


        // Ask the user for their favorite color
        System.out.print("What is your favorite color? ");
        color = scanner.nextLine().toLowerCase();

        // Using switch statement to print a message based on the color
        switch (color) {
            case "blue" -> System.out.println("Your favorite color is blue!");
            case "red" -> System.out.println("Your favorite color is red!");
            case "green" -> System.out.println("Your favorite color is green!");
            case "yellow" -> System.out.println("Your favorite color is yellow!");
            default -> System.out.println("Other color chosen ...");
        }

        // Close the scanner to prevent resource leaks
        scanner.close();

    }
}

