package lecture02.examples;

import java.util.Scanner;

public class Bugs {
    public static void main(String[] args) {
        double area;
        double answer;
        Scanner userInput = new Scanner(System.in);

        // Rectangle or oval?
        System.out.println("If the area is an oval, enter '1'; otherwise it will be a rectangle: ");
        int shape = userInput.nextInt();

        // Read width and height (or major/minor radius)
        System.out.println("Enter the width (or major radius): ");
        int x = userInput.nextInt();
        System.out.println("Enter the height (or minor radius): ");
        int y = userInput.nextInt();
        System.out.println("Enter the population: ");
        int population = userInput.nextInt();

        userInput.close(); // done reading from user

        if (shape == 1) { // ellipse
            area = x * y * Math.PI;
        } else { // rectangle
            area = x * x;
        }
        answer = area / population;
        System.out.println("Population density: " + answer);
    }

}
