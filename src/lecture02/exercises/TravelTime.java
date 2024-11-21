package lecture02.exercises;

import java.util.Scanner;

public class TravelTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How far do you have to travel (km)?");
        double distance = scanner.nextDouble();
        System.out.println("How are you travelling? 1 = walk, 2 = bicycle, 3 = car, 4 = train");
        int travelForm = scanner.nextInt();

        double speed = 0;

        if ((distance < 0) || (travelForm < 1) || (travelForm > 4)) {
            System.out.println("Error in your inputs");
        } else {
            if (travelForm == 1) {
                speed = 5;
            } else if (travelForm == 2) {
                speed = 15;
            } else if (travelForm == 3) {
                speed = 50;
            } else if (travelForm == 4) {
                speed = 70;
            }
            double time = distance / speed;
            int hours = (int) time;

            int minutes = (int) ((time - hours) * 60);
            System.out.println("Time required is " + hours + " hours and " + minutes + " minutes");
        }
    }
}
