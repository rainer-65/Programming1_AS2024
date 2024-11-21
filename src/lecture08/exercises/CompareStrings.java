package lecture08.exercises;

public class CompareStrings {


    // Part a: Case-sensitive comparison
    public static boolean areStringsEqual(String str1, String str2) {
        return str1.equals(str2);
    }

    // Part b: Case-insensitive comparison
    public static boolean areStringsEqualIgnoreCase(String str1, String str2) {
        return str1.equalsIgnoreCase(str2);
    }

    // Part c: Lexicographical comparison
    public static int compareStrings(String str1, String str2) {
        return str1.compareTo(str2);
    }

    public static void main(String[] args) {
        // Test Part a
        System.out.println("Part a - Case-sensitive:");
        System.out.println(areStringsEqual("Hello", "Hello")); // Expected output: true
        System.out.println(areStringsEqual("Hello", "hello")); // Expected output: false

        // Test Part b
        System.out.println("\nPart b - Case-insensitive:");
        System.out.println(areStringsEqualIgnoreCase("Hello", "hello")); // Expected output: true
        System.out.println(areStringsEqualIgnoreCase("Hello", "world")); // Expected output: false

        // Test Part c
        System.out.println("\nPart c - Lexicographical comparison:");
        System.out.println(compareStrings("apple", "banana")); // Expected output: negative number
        System.out.println(compareStrings("banana", "apple")); // Expected output: positive number
        System.out.println(compareStrings("apple", "apple"));  // Expected output: 0
    }

}
