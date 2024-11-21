package lecture05.exercises;

import java.util.ArrayList;

public class StringManipulator {

    // Method to convert strings in the ArrayList to uppercase
    public static ArrayList<String> convertToUppercase(ArrayList<String> list) {
        ArrayList<String> upperCaseList = new ArrayList<>(); // New ArrayList to store uppercase strings

        for (String str : list) {
            upperCaseList.add(str.toUpperCase());  // Convert each string to uppercase and add to new list
        }

        return upperCaseList;
    }

    public static void main(String[] args) {
        // Test the convertToUppercase method
        ArrayList<String> inputList = new ArrayList<>();
        inputList.add("hello");
        inputList.add("world");
        inputList.add("java");

        // Call the method and store the result in a new ArrayList
        ArrayList<String> upperCaseResult = convertToUppercase(inputList);

        // Print the original and the converted list
        System.out.println("Original List: " + inputList);
        System.out.println("Uppercase List: " + upperCaseResult);
    }
}
