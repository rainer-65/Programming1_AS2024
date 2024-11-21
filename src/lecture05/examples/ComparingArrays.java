package lecture05.examples;

import java.util.Arrays;

public class ComparingArrays {

    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};


        boolean equals1 = Arrays.equals(array1, array2);
        System.out.println("Equality? version1: " + equals1);

        boolean equals2 = false;
        if (array1.length == array2.length) {
            equals2 = true;
            int i = 0;
            while (i < array1.length) {
                if (!(array1[i] == (array2[i])))
                    equals2 = false;
                i++;
            }
        }

        System.out.println("Equality? version2: " + equals1);


    }
}
