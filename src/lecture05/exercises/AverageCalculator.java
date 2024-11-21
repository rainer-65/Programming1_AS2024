package lecture05.exercises;

public class AverageCalculator {
    public static double calculateAverage(int[] numbers) {
        if (numbers.length == 0) {
            return 0.0; // Return 0.0 for an empty array
        }

        int sum = 0;
        int i = 0;  // Initialize index for while loop
        while (i < numbers.length) {
            sum += numbers[i];  // Add the current number to the sum
            i++;  // Move to the next element
        }

        return (double) sum / numbers.length;  // Calculate the average as a double
    }

    public static void main(String[] args) {
        int[] input = {2, 4, 6, 8, 10};
        double average = calculateAverage(input);
        System.out.println("The average is: " + average);
    }
}
