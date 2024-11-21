package lecture05.exercises;

public class FactorialCalculator {

    // Method to calculate factorial using a while loop
    public static int factorial(int valIn) {
        int answer = 1;

        while (valIn > 0) {
            answer *= valIn;
            valIn--;
        }

        return answer;
    }

    public static void main(String[] args) {
        int number = 5;  // You can change this value to test other inputs
        long result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}

