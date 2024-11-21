package lecture06.exercises;

import java.util.ArrayList;

public class FavoriteFruits {
    public static void main(String[] args) {
        // Create an ArrayList to store favorite fruits
        ArrayList<String> fruits = new ArrayList<>();

        // Add some fruits to the ArrayList
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Kiwi");
        fruits.add("Pineapple");

        // Use a for-each loop to print each fruit
        System.out.println("My favorite fruits are:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

