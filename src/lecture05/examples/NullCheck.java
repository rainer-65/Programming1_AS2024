package lecture05.examples;

public class NullCheck {

    public static void main(String[] args) {
        // When we try to invoke a method call for a null reference, this will result in a so-called NullPointerException.

        // Strings
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("An exception occurred: " + e.getMessage());
        }


        // Wrapper class Integer
        Integer num = null;
        if (num != null) {
            int value = num;
            System.out.println(value);
        } else {
            System.out.println("Integer is null");
        }


    }

}


