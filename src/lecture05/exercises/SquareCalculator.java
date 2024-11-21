package lecture05.exercises;

public class SquareCalculator {
    public static Integer squareNumber(int number) {
        return number * number;
    }

    public static void main(String[] args) {
        int input = 5;
        Integer result = squareNumber(input);
        System.out.println("The square of " + input + " is: " + result);
    }
}

