package lecture01.exercises;

public class BooleanCalculations {
    public static void main(String[] args) {
        int i=1, j=2, k=3;

        boolean iIsBiggest = (i > j) && (i > k);
        System.out.println("i is biggest is: " + iIsBiggest);

        boolean jIsNotSmallest = ! ((j <= i) && (j <= k));
        System.out.println("j is not smallest is: " + jIsNotSmallest);

        boolean kIsBetween = ((i<k) && (j>k)) || ((i>k) && (j<k));
        System.out.println("k is between is: " + kIsBetween);

        boolean allEqual = (i==j) && (i==k); //(j==k) is given because both were already equal to i.
        System.out.println("allEqual is: " + allEqual);

        boolean twoAreEqual = (i==j) || (i==k) || (j==k);
        System.out.println("twoAreEqual is: " + twoAreEqual);
    }
}
