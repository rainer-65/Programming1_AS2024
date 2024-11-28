package assignment03;

import java.util.Collections;
import java.util.Scanner;

public class GameManager {
    private Player player;
    private MiniGame miniGame;
    private int turn;

    public GameManager(String playerName) {
        this.player = new Player(playerName);
        this.miniGame = new MiniGame();
        this.turn = 1;
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nTurn " + turn);
            System.out.println("1. Create a new pet");
            System.out.println("2. Feed a pet");
            System.out.println("3. Play with a pet");
            System.out.println("4. Let a pet rest");
            System.out.println("5. Play a mini-game");
            System.out.println("6. Display status");
            System.out.println("7. Search pet");
            System.out.println("8. Sort pets");
            System.out.println("9. Exit game");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    createPet();
                    break;
                case 2:
                    feedPet();
                    turn++; // Increasing turn
                    break;
                case 3:
                    playWithPet();
                    turn++; // Increasing turn
                    break;
                case 4:
                    restPet();
                    turn++; // Increasing turn
                    break;
                case 5:
                    playMiniGame();
                    break;
                case 6:
                    player.displayStatus();
                    break;
                case 7:
                    searchForPet();
                    break;
                case 8:
                    sortPets();
                    break;
                case 9:
                    System.out.println("Game Over! Total turns survived: " + turn);
                    return;
                default:
                    System.out.println("Invalid choice.");
            }

            updatePetsStatus();     // Done after each turn

            if (checkGameOver()) {
                System.out.println("Game Over! All pets are starving, and you're out of food.");
                break;
            }

        }
    }

    private void createPet() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter pet name: ");
        String petName = scanner.nextLine();

        System.out.println("Enter pet type: ");
        System.out.println("1. Normal Pet");
        System.out.println("2. Mighty Pet");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                player.addPet(new Pet(petName));
                System.out.println("Pet " + petName + " created!");
                break;
            case 2:
                player.addPet(new MightyPet(petName));
                System.out.println("Pet " + petName + " created!");
                break;
            default:
                System.out.println("Invalid choice.");
        }

    }

    private void feedPet() {
        if (player.getPets().isEmpty()) {
            System.out.println("No pets to feed.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a pet to feed:");
        for (int i = 0; i < player.getPets().size(); i++) {
            System.out.println((i + 1) + ". " + player.getPets().get(i).getName());
        }

        int choice = scanner.nextInt();
        if (choice > 0 && choice <= player.getPets().size()) {
            Pet pet = player.getPets().get(choice - 1);
            if (player.feedPet(pet)) {
                System.out.println("Fed " + pet.getName() + "!");
            } else {
                System.out.println("Not enough food to feed " + pet.getName() + ".");
            }
        } else {
            System.out.println("Invalid choice.");
        }
    }

    private void playWithPet() {
        if (player.getPets().isEmpty()) {
            System.out.println("No pets to play with.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a pet to play with:");
        for (int i = 0; i < player.getPets().size(); i++) {
            System.out.println((i + 1) + ". " + player.getPets().get(i).getName());
        }

        int choice = scanner.nextInt();
        if (choice > 0 && choice <= player.getPets().size()) {
            Pet pet = player.getPets().get(choice - 1);
            pet.play();
        } else {
            System.out.println("Invalid choice.");
        }
    }

    private void restPet() {
        if (player.getPets().isEmpty()) {
            System.out.println("No pets to rest.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a pet to let rest:");
        for (int i = 0; i < player.getPets().size(); i++) {
            System.out.println((i + 1) + ". " + player.getPets().get(i).getName());
        }

        int choice = scanner.nextInt();
        if (choice > 0 && choice <= player.getPets().size()) {
            Pet pet = player.getPets().get(choice - 1);
            pet.rest();
        } else {
            System.out.println("Invalid choice.");
        }
    }

    private void playMiniGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Number Guessing Game");
        System.out.println("2. Word Scramble Game");
        System.out.println("3. Guessing multiplication of numbers");
        System.out.println("4. Fortune wheel");
        System.out.print("Choose a mini-game: ");
        int choice = scanner.nextInt();

        int reward = 0;
        switch (choice) {
            case 1:
                reward = miniGame.playNumberGuessingGame();
                break;
            case 2:
                reward = miniGame.playWordScrambleGame();
                break;
            case 3:
                reward = miniGame.playMultiplicationGuessGame();
                break;
            case 4:
                reward = miniGame.fortuneWheel();
                break;
            default:
                System.out.println("Invalid choice.");
        }

        if (reward > 0) {
            player.earnFood(reward);
            System.out.println("You earned " + reward + " food!");
        }
    }


    private void searchForPet() {
        boolean found = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter pet name (case sensitivity ignored): ");
        String searchedPetName = scanner.nextLine();
        // ArrayList of Pets empty
        if (player.getPets().isEmpty()) {
            System.out.println("No pets in list available");
        }
        // searched pet name is empty
        else if (searchedPetName.isEmpty()) {
            System.out.println("Search term was empty");
        } else
            // hits
            for (int i = 0; i < player.getPets().size(); i++) {
                if (searchedPetName.equalsIgnoreCase(player.getPets().get(i).getName())) {
                    System.out.println("Pet found with ID: " + player.getPets().get(i).getId());
                    System.out.println("Attributes: " + player.getPets().get(i).getStatus());
                    found = true;
                }
            }
        if (!found) {
            System.out.println("No pet named " + searchedPetName + " found!");
        }

    }

    private void sortPets() {
        if (player.getPets().isEmpty()) {
            System.out.println("No pets in list available");
        } else {
            Collections.sort(player.getPets());
            for (Pet pet : player.getPets()) {
                System.out.print("Pet ID: " + pet.getId() + " " + pet.getStatus());
            }
        }

    }

    private void updatePetsStatus() {
        for (Pet pet : player.getPets()) {
            pet.updateStatus();
        }
    }

    private boolean checkGameOver() {
        if (player.getFoodSupply() <= 0) {
            for (Pet pet : player.getPets()) {
                if (pet.getHunger() <= 80) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}

