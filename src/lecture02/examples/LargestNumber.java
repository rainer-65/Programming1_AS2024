package lecture02.examples;

public class LargestNumber {
    public static void main(String[] args) {
        int x = 3;
        int y = 6;
        int z = -4;

        if ( (x > y) && (x > z) ) {
            System.out.println("x is the largest number");
        } else if ( (y > x) && (y > z) ) {
            System.out.println("y is the largest number");
        } else {
            System.out.println("z is the largest number");
        }

    }
}
