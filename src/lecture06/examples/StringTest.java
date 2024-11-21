package lecture06.examples;

import java.util.Scanner;

public class StringTest {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Wie viele 'X' zu 'Hello' hinzufügen? ");
        int number = in.nextInt();
        String stringErweiterung = "";


        // Option 1: Schleife
        String hello = "Hello";
        for (int i = 0; i < number; i++) {
            stringErweiterung += "X";
        }
        hello = hello + stringErweiterung;
        System.out.println(hello);


        // Option 2: Verwendung des StringBuilder
        StringBuilder hello2 = new StringBuilder("Hello");
        for (int i = 0; i < number; i++) {
            hello2.append("X");
            // Alternative: hello2.append(String.valueOf('X'));
        }
        System.out.println(hello2);


    }
}
