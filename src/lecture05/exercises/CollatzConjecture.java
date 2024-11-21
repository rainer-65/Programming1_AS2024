package lecture05.exercises;

public class CollatzConjecture {

    // Method to count the number of steps to reach 1
    public static int collatzSteps(int n) {
        int steps = 0;

        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;  // If n is even, divide by 2
            } else {
                n = 3 * n + 1;  // If n is odd, apply 3n + 1
            }
            steps++;  // Increment the step count after each operation
        }

        return steps;
    }

    public static void main(String[] args) {
        int number = 13;  // You can change this value to test other inputs
        int result = collatzSteps(number);
        System.out.println("Number of steps for " + number + " to reach 1 is: " + result);
    }
}

