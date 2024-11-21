package lecture06.examples;

public class Palindrome {

    public static void main(String[] args) {
        String textToTest = "A man, a plan, a canal: Panama!";
        System.out.println(isPalindrome(textToTest) ? textToTest + " is a palindrome." : textToTest + " is not a palindrome.");
    }


    private static boolean isPalindrome(String textIn) {
        String text = new String();
        int index = 0;
        while (index < textIn.length()) {
            char c = textIn.charAt(index++);
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c);
                text += c;
            }
        }
        int indexStart = 0;
        int indexEnd = text.length() - 1;
        boolean answer = true;
        while (indexStart < indexEnd) {
            char c = text.charAt(indexStart++);
            char d = text.charAt(indexEnd--);
            answer = answer && (c == d);
        }
        return answer;
    }


}
