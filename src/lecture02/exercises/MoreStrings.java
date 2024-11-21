package lecture02.exercises;

import java.util.Scanner;

public class MoreStrings {
    public static void main(String[] args) {
        String str = "To be or not to be? That is the question.";
        System.out.println(str);
        System.out.println(str.length());

        int indexOfQuestionMark = str.indexOf('?');
        System.out.println(indexOfQuestionMark);

        String question = str.substring(0, indexOfQuestionMark+1);
        System.out.println(question);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a great-sounding name, like 'Alexander the Great'");
        String input = scanner.nextLine().trim();
        scanner.close();

        String name = input.substring(0, input.indexOf(' '));
        System.out.println("This is the story of " + name);
        String title = input.substring(input.indexOf(' ')).trim();
        System.out.println("Some people called " + name + " '" + title + "'");
    }
}
