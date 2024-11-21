package lecture08.exercises;

public class Pet implements Comparable<Pet>{
    private static int nextId = 0;
    private final int id;
    private String name;
    private int happiness;
    private int hunger;
    private int energy;

    private final static int max_happiness = 100;
    private final static int min_happiness = 0;

    private final static int max_hunger = 100;
    private final static int min_hunger = 0;

    private final static int max_energy = 100;
    private final static int min_energy = 0;

    public Pet() {
        this.id = getNextId();
        this.happiness = 50;
        this.hunger = 50;
        this.energy = 50;
    }

    public Pet(String name) {
        this();
        this.name = name;
    }

    private static int getNextId() {
        return nextId++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        }
    }

    public int getHappiness() {
        return happiness;
    }

    private void setHappiness(int happiness) {
        this.happiness = Math.max(min_happiness, Math.min(happiness, max_happiness));
        if (this.happiness == 100) {
            System.out.println(this.name + " is very happy");
        } else if (this.happiness > 75) {
            System.out.println(this.name + " is happy.");
        } else if (this.happiness > 50) {
            System.out.println(this.name + " is little happy.");
        } else if (this.happiness > 25) {
            System.out.println(this.name + " is little sad.");
        } else if (this.happiness > 0) {
            System.out.println(this.name + " is sad.");
        } else {
            System.out.println(this.name + " is very sad.");
        }
    }

    private void changeHappiness(int change) {
        this.happiness = Math.max(min_happiness, Math.min(happiness + change, max_happiness));
    }

    public int getHunger() {
        return hunger;
    }

    private void setHunger(int hunger) {
        this.hunger = Math.max(min_hunger, Math.min(hunger, max_hunger));
        if (this.hunger == 100) {
            System.out.println(this.name + " is starving.");
        } else if (this.hunger > 75) {
            System.out.println(this.name + " is very hungry.");
        } else if (this.hunger > 50) {
            System.out.println(this.name + " is hungry.");
        } else if (this.hunger > 25) {
            System.out.println(this.name + " is little hungry.");
        } else if (this.hunger > 0) {
            System.out.println(this.name + " is fine.");
        } else {
            System.out.println(this.name + " is full.");
        }
    }

    private void changeHunger(int change) {

        this.hunger = Math.max(min_hunger, Math.min(hunger + change, max_hunger));
    }

    public int getEnergy() {
        return energy;
    }

    private void setEnergy(int energy) {
        this.energy = Math.max(min_energy, Math.min(energy, max_energy));
        if (this.energy == 100) {
            System.out.println(this.name + " is full of energy.");
        } else if (this.energy > 75) {
            System.out.println(this.name + " is energized.");
        } else if (this.energy > 50) {
            System.out.println(this.name + " is little energized.");
        } else if (this.energy > 25) {
            System.out.println(this.name + " is little tired.");
        } else if (this.energy > 0) {
            System.out.println(this.name + " is very tired.");
        } else {
            System.out.println(this.name + " is out of energy.");
        }
    }

    private void changeEnergy(int change) {
        this.energy = Math.max(min_energy, Math.min(energy + change, max_energy));
    }

    public void updateStatus() {
        changeHappiness(-3);
        changeHunger(+5);
        changeEnergy(-2);
    }

    public void feed() {
        changeHappiness(+10);
        changeHunger(-20);
    }

    public void play() {
        changeHappiness(+15);
        changeHunger(+10);
        changeEnergy(-15);
    }

    public void rest() {
        changeHunger(+5);
        changeEnergy(+20);
    }

    public String getStatus() {
        return name + " - Happiness: " + happiness + " | Hunger: " + hunger + " | Energy: " + energy;
    }

    // Implementing the compareTo method for the Comparable interface
    @Override
    public int compareTo(Pet other) {
        return this.id - other.id;
    }

    // Overriding equals method
    @Override
    public boolean equals(Object obj) {
        boolean result = false;
        if (obj != null) {
            if (this.getClass() == obj.getClass()) {
                Pet other = (Pet) obj;
                result = this.id == other.id;
            }
        }
        return result;
    }
}
