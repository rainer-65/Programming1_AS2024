package lecture08.examples;

public class TestingEquals {

    public static void main(String[] args) {
        String s1 = new String("1234");
        String s2 = new String("Hello");
        String s3 = new String("1234");
        String s4 = null; // Missing object
        String s5 = new String("HELLO");
        Integer i1 = 1234;

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(i1));
        System.out.println(s2.equals(s5));
        System.out.println(s2.equalsIgnoreCase(s5));        // Ignoring Case Sensitivity

    }

}
