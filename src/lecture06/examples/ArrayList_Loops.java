package lecture06.examples;

import java.util.ArrayList;

public class ArrayList_Loops {

    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> names = new ArrayList<>();
        names.add("Rainer");
        names.add("Bob");
        names.add("John");

        // Iterate with while loop
        int index = 0;

        while (index < names.size()) {
            System.out.println(names.get(index));
            index++;
        }

        System.out.println();

        // Iterate with do ... while loop
        index = 0;
        do {
            System.out.println(names.get(index));
            index++;
        } while (index < names.size());

        System.out.println();

        // Iterate with for loop
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        System.out.println();

        // Iterate with enhanced for loop
        for (String name : names) {
            System.out.println(name);
        }

    }

}
