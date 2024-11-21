package lecture06.exercises;

public class FizzBuzz {
    public static void main(String[] args) {
        // Loop through numbers from 1 to 100
        for (int i = 1; i <= 100; i++) {
            // Check if number is a multiple of both 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            // Check if number is a multiple of 3
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            // Check if number is a multiple of 5
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            // If the number is not divisible by 3 or 5, print the number
            else {
                System.out.println(i);
            }
        }
    }
}

