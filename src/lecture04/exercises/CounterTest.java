package lecture04.exercises;

public class CounterTest {

    public static void main(String[] args) {
        // Create several Counter objects
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        // Print the value of count
        System.out.println("Count: " + Counter.getCount());
    }
}
