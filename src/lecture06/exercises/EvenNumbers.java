package lecture06.exercises;

public class EvenNumbers {

    public static void main(String[] args) {
        // Initialize variables
        int counter = 0;  // This keeps track of how many even numbers have been printed
        int number = 0; // Number considered

        // Use a while loop to print the first 10 even numbers
        System.out.println("Usage of while loop");
        while (counter < 10) {
            if (number % 2 == 0) {
                System.out.println(number + " is even");
                counter++;
            }
            number++;

        }
        System.out.println("\nUsage of do while loop");

        // Reset counter and number
        counter = 0;
        number = 0;

        // Use a do while loop to print the first 10 even numbers
        do {
            if (number % 2 == 0) {
                System.out.println(number + " is even");
                counter++;
            }
            number++;

        } while (counter < 10);

    }
}

