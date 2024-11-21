package lecture01.examples;

public class Vat {
    public static void main(String[] args) {
        double total = 10.0;
        double vat = 0.08;

        double basePrice = total / (1 + vat);
        double vat_paid = total - basePrice;

        System.out.println("VAT paid = " + vat_paid);
        System.out.println("Base price = " + basePrice);
    }
}
