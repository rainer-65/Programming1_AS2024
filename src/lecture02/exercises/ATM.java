package lecture02.exercises;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        int pin = 1234;
        System.out.println("Pin");
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        if (input == pin){
            System.out.println("How much money do you like to withdraw?");
            int withdraw = scanner.nextInt();
            if ( (withdraw > 10) && (withdraw % 10==0) ){
                System.out.println("You have withdrawn "+withdraw+ " CHF");
            } else {
                System.out.println("Value is invalid");
            }
        } else {
            System.out.println("ATM is locked");
        }
        scanner.close();
    }
}
