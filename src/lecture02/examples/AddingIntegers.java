package lecture02.examples;

import java.util.Scanner;

public class AddingIntegers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();

        int result = x + y + z;

        System.out.println(result);

    }
}
