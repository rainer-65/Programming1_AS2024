package lecture03.examples;

public class DiceMain {
    public static void main(String[] args) {

        Dice sixSidedDice = new Dice();

        System.out.println(sixSidedDice.getNumberOfSides());
        System.out.println(sixSidedDice.rollDice());

        Dice dice32 = new Dice (32);
        System.out.println(dice32.rollDice());

        double dice32Average = dice32.theoreticalAverage();
        System.out.println(dice32Average);

        System.out.println(sixSidedDice.theoreticalAverage());

    }
}
