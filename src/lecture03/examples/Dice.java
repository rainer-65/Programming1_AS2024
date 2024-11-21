package lecture03.examples;

import java.util.Random;

public class Dice {

    private int numberOfSides;

    public Dice(){
        this.numberOfSides = 6;
    }

    public Dice(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public int getNumberOfSides(){
        return this.numberOfSides;
    }

    public double theoreticalAverage(){
        double average = (1+this.numberOfSides) / 2.0;
        return average;
    }

    public int rollDice(){
        Random random = new Random();
        return random.nextInt(this.numberOfSides)+1;
    }
}
