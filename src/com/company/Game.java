package com.company;
import java.sql.SQLOutput;
import java.util.*;
import java.lang.Math;

public class Game {
    static Scanner scanner = new Scanner(System.in);
    int rounds;
    ArrayList<Player> playerList = new ArrayList<>();

    private void createPlayers() {
        System.out.println(" - How many players will play?");
        System.out.println(" - Choose from 1, 2, 3 or 4.");
        int playerAmount = Integer.parseInt(scanner.nextLine());
        if (playerAmount >= 1 & playerAmount <= 4) {
            for (int i = 1; i <= playerAmount; i++) {
                System.out.println("Choose your name player!");
                playerList.add(new Player(scanner.nextLine(), 1000));
            }
        } else {
            createPlayers();
        }
    }

    private void setRounds() {
        int minRound = 5;
        int maxRound = 30;
        System.out.println(" - How many rounds do you which to play? (5-30)");
        rounds = scanner.nextInt();
        if (rounds >= 5 && rounds <= 30) {
            System.out.println(" - Let's play " + rounds + " rounds!");
        } else {
            System.out.println(" - you have one more try to write an number between 5-30 or I will randomize one for you!");
            rounds = scanner.nextInt();
            if (rounds >= 5 && rounds <= 30) {
                System.out.println(" - At last! We're playing " + rounds + " rounds!");
            } else {
                rounds = (minRound) + (int) (Math.random() * (maxRound - minRound + 1));
                System.out.println(" - Okay. We're playing " + rounds + " rounds!");
            }
        }
    }

    private void playAgain() {
        /*
        var newGame = Dialogs.promptInt("Play again?", 1, 2);
        switch (newGame){
            case 1 -> Game;
        }

         */
        //spela igen eller stäng spel
        //spela igen = samma spelare eller inte?
    }

    public Game() {
        createPlayers();
        setRounds();
        for (var round = 1; round <= rounds; round++) {
            Iterator<Player> itr = playerList.iterator();
            while (itr.hasNext()) {
                Player player = itr.next();
                if (player.money <= 0) {
                    itr.remove();
                } else {
                    System.out.println("\n - ROUND " + round + "/" + rounds);
                    System.out.println(" - PLAYER: " + player.playerName + " Currency: " + player.money);
                    System.out.println(" - ANIMALS: ");
                    for (var animal : player.animalList) {
                        System.out.println(" - [" + animal.animalType + "][" + animal.name + "][" + animal.gender + "][Health: " + animal.health + "]");
                    }
                    System.out.print(" - FOOD: ");
                    for (var food : player.foodList) {
                        System.out.print("[" + food.foodName + "]");
                    }
                    System.out.println("");
                    Store.whatToDO(player);
                    player.decreaseAnimalsHealth();
                }
            }
        }
    }
}