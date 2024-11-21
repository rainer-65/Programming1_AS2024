package lecture01.exercises;

public class Caesar {
    public static void main(String[] args) {
        char c = 'g';
        System.out.println(c);

        int key = 3;

        char encoded = (char)(key + (int)c);
        System.out.println(encoded);

        char decoded = (char)((int)encoded-key);
        System.out.println(decoded);

        System.out.println();

        c = 'z';
        System.out.println(c);

        encoded = (char)(key + (int)c);
        System.out.println(encoded);

        decoded = (char)((int)encoded-key);
        System.out.println(decoded);
    }
}
