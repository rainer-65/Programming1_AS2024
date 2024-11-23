package assignment03;

import java.util.ArrayList;

public class Player {
    private String name;
    private int foodSupply;
    private ArrayList<Pet> pets;

    public Player(String name) {
        this.name = name;
        this.foodSupply = 50; // Starting food
        this.pets = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getFoodSupply() {
        return foodSupply;
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public void addPet(Pet pet) {
        pets.add(pet);
    }

    public boolean feedPet(Pet pet) {
        if (foodSupply > 0) {
            pet.feed();
            foodSupply--;
            return true;
        }
        return false;
    }

    public void earnFood(int amount) {
        foodSupply += amount;
    }

    public void displayStatus() {
        System.out.println("Player: " + name);
        System.out.println("Food Supply: " + foodSupply);
        System.out.println("Number of Pets: " + pets.size());
        System.out.println("Pet Details:");
        for (Pet pet : pets) {
            System.out.println("- " + pet.getName() + ": Hunger = " + pet.getHunger() + ", Happiness = " + pet.getHappiness() + ", Energy = " + pet.getEnergy());
        }
    }
}

