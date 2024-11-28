package assignment03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter player name: ");
        String playerName = scanner.nextLine();

        GameManager gameManager = new GameManager(playerName);
        gameManager.startGame();
    }
}

