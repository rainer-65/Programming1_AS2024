package lecture02.exercises;

import java.util.Scanner;

public class StoppingDistance {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the velocity in km/h: ");
        double velocityKM = userInput.nextDouble();
        System.out.println("Velocity entered " + velocityKM + "km/h");
        userInput.close(); // Done reading information

        double velocityMeter = velocityKM / 3.6;
        System.out.println("Velocity: " + velocityMeter + "m/s");

        double reactionTime = 0.3f; // in seconds

        // Calculate reaction distance
        double reactionDistance = reactionTime * velocityMeter;
        System.out.println("Reaction distance: " + reactionDistance);

        // Calculate braking distance
        double brakingDistance = velocityMeter * velocityMeter / 16.0f;
        System.out.println("Braking distance: " + brakingDistance);

        // Calculate the stopping distance
        double stoppingDistance = reactionDistance + brakingDistance;
        System.out.println("Stopping distance: " + Math.round(stoppingDistance));
    }
}
