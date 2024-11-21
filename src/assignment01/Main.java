package assignment01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pet nameless = new Pet();
        while (nameless.getHunger() < 100) {
            System.out.println(nameless.getStatus());
            nameless.updateStatus();
        }
        System.out.println(nameless.getStatus());

        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        Pet named_pet = new Pet(name);
        for (int i = 0; i < 10; i++) {
            named_pet.updateStatus();
            System.out.println(named_pet.getStatus());
            careWell(named_pet);
        }
        System.out.println(named_pet.getStatus());
    }

    public static void careWell(Pet pet){
        int feed = 100 - pet.getHunger();
        int happiness = pet.getHappiness();
        int energy = pet.getEnergy();
        if((feed < happiness) && (feed < energy))   {
            pet.feed();
            System.out.println("feed");
        }
        else if ((happiness < energy) && (happiness < feed))
        {
            pet.play();
            System.out.println("play");
        }
        else {
            pet.rest();
            System.out.println("rest");
        }
    }
}