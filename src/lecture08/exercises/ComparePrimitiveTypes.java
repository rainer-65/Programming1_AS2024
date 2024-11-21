package lecture08.exercises;

public class ComparePrimitiveTypes {

    public boolean isGreater(int num1, int num2) {
        return num1 > num2;
    }

    public boolean areApproximatelyEqual(double num1, double num2) {
        return Math.abs(num1 - num2) < 0.0001;
    }


    public boolean isAlphabeticallyBefore(char char1, char char2) {
        return char1 < char2;
    }

}
