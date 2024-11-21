package lecture01.examples;

public class FloatingPointErrors {
    public static void main(String[] args) {
        double A = 1000000;
        double B = (A + 1) / 1000;
        double C = A / 1000;
        double D = B - C;
        double E = 1000000 * D;
        double F = E - 1000;

        System.out.println(F);
    }
}
