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
        for (int i = 1; i <= playerAmount; i++) {
            System.out.println("Choose your name player!");
            playerList.add(new Player(scanner.nextLine(), 1000));
        }
    }
    private void displayAllPlayers(){
        for (var player: playerList) {
            System.out.println(player.playerName);
        }
    }
    private void setRounds(){
        int minRound = 5;
        int maxRound = 30;
        System.out.println(" - How many rounds do you which to play? (5-30)");
        rounds = scanner.nextInt();
        if (rounds >= 5 && rounds <= 30){
            System.out.println(" - Let's play " + rounds + " rounds!");
        }
        else {
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
    public Game(){
        createPlayers();
        setRounds();
        displayAllPlayers(); /* medot mest för att se att det funkar */
        for(var round = 1; round <= rounds; round++){
            for(var player: playerList){
                System.out.println(" - ROUND " + round + "/" + rounds);
                System.out.println(" - PLAYER: " + player.playerName);
                   Store.whatToDO(player);
            }
        }
//        System.out.println(Player.playerList.get(0).playerName + ": " + Player.playerList.get(0).money + "Kr.");
    }
}
