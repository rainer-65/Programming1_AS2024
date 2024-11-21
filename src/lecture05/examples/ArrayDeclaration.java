package lecture05.examples;

public class ArrayDeclaration {

    public static void main(String[] args) {

        // One Dimensional Array
        // Syntax for default values
        int[] num = new int[5];

        // or (less preferred)
        int num2[] = new int[5];

        // Syntax with values given (variable/field initialization)
        int[] num3 = {1, 2, 3, 4, 5};

        // or (less preferred)
        int num4[] = {1, 2, 3, 4, 5};


        // Multidimensional array
        // Declaration
        int[][] num5 = new int[5][2];

        // or
        int num6[][] = new int[5][2];

        // or
        int[] num7[] = new int[5][2];
        // Initialization
        num7[0][0] = 1;
        num7[0][1] = 2;
        num7[1][0] = 1;
        num7[1][1] = 2;
        num7[2][0] = 1;
        num7[2][1] = 2;
        num7[3][0] = 1;
        num7[3][1] = 2;
        num7[4][0] = 1;
        num7[4][1] = 2;

        // or
        int[][] num8 = {{1, 2}, {1, 2}, {1, 2}, {1, 2}, {1, 2}};
    }

}
