package lecture02.exercises;

import java.util.Scanner;

public class Rounding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double input = scanner.nextDouble();
        int roundedToInt = (int) Math.round(input);
        System.out.println(roundedToInt);

        double tenth = 10.0; //0.1 = 1/10
        double roundedToTenth = Math.round(tenth * input) / tenth;
        System.out.println(roundedToTenth);

        double twentieth = 20.0; //0.05 = 1/20
        double roundedToTwentieth = Math.round(twentieth * input) / twentieth;
        System.out.println(roundedToTwentieth);
    }
}
