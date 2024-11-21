package lecture02.exercises;

import java.util.Scanner;

public class GivingChange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount:");
        double amount = scanner.nextDouble();
        scanner.close();
        
        if (amount < 0) {
            System.out.println("Amount can't be negative");
        }
        else {
            double remaining = amount;

            int amountOfTwentyFracs = (int) remaining / 20;
            System.out.println("Twenty franc bills: " + amountOfTwentyFracs);
            remaining = remaining - amountOfTwentyFracs * 20;

            int amountOfTenFracs = (int) remaining / 10;
            System.out.println("Ten franc bills: " + amountOfTenFracs);
            remaining = remaining - amountOfTenFracs * 10;

            int amountOfFiveFracs = (int) remaining / 5;
            System.out.println("Five franc coins: " + amountOfFiveFracs);
            remaining = remaining - amountOfFiveFracs * 5;

            int amountOfTwoFracs = (int) remaining / 2;
            System.out.println("Two franc coins: " + amountOfTwoFracs);
            remaining = remaining - amountOfTwoFracs * 2;

            int amountOfOneFracs = (int) remaining;
            System.out.println("One franc coins: " + amountOfOneFracs);
            remaining = remaining - amountOfOneFracs;

            int amountOfFiftyRappen  = (int) (remaining / 0.5);
            System.out.println("Fifty rappen coins: " + amountOfFiftyRappen);
            remaining = remaining - amountOfFiftyRappen * 0.5;

            int amountOfTwentyRappen = (int) (remaining / 0.2);
            System.out.println("Twenty rappen coins: " + amountOfTwentyRappen);
            remaining = remaining - amountOfTwentyRappen * 0.2;

            int amountOfTenRappen = (int) (remaining / 0.1);
            System.out.println("Ten rappen coins: " + amountOfTenRappen);
        }
        
    }
}
