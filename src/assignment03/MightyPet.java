package assignment03;

public class MightyPet extends Pet {

    public MightyPet() {
        super();
    }

    public MightyPet(String name) {
        super(name);
    }

    @Override
    public void updateStatus() {
        changeHappiness(-2);
        changeHunger(+1);
        changeEnergy(-1);
    }

    @Override
    public void feed() {
        changeHappiness(+15);
        changeHunger(-25);
    }

    @Override
    public void play() {
        changeHappiness(+20);
        changeHunger(+10);
        changeEnergy(-10);
    }

    @Override
    public void rest() {
        changeHunger(+2);
        changeEnergy(+30);
    }

}
