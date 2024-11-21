package lecture05.exercises;

public class SumCalculator {
    public static int sumUpTo(int n) {
        int sum = 0;
        int i = 1;  // Starting from 1
        while (i <= n) {
            sum += i;  // Add i to sum
            i++;       // Increment i
        }
        return sum;
    }

    public static void main(String[] args) {
        int input = 5;
        int result = sumUpTo(input);
        System.out.println("The sum of numbers from 1 to " + input + " is: " + result);
    }
}

