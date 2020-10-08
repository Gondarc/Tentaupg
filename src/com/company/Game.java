package com.company;
import java.sql.SQLOutput;
import java.util.*;
import java.lang.Math;

public class Game {
    Scanner scanner = new Scanner(System.in);
    int rounds;

    private void setRounds(){

        int minRound = 5;
        int maxRound = 30;

        System.out.println(" - How many rounds do you which to play? (5-30)");
        rounds = scanner.nextInt();
        if (rounds >= 5 && rounds <= 30){
            System.out.println(" - Let's play " + rounds + " rounds!");
        }
        else{
            System.out.println(" - you have one more try to write an number between 5-30 or I will randomize one for you!");
            rounds = scanner.nextInt();
            if (rounds >= 5 && rounds <= 30){
                System.out.println("At last! We're playing " + rounds + " rounds!");
            }
            else{
                rounds = (minRound ) + (int)(Math.random()* ( maxRound - minRound + 1));
                System.out.println(" - Okey. We're playing " + rounds + " rounds!");
            }
        }
    }
    private void displayAllPlayers(){
        switch (Player.playerList.size()){
            case 1:
                System.out.println(" - Chosen player is : ");
                System.out.println(Player.playerList.get(0).playerName + ": " + Player.playerList.get(0).money + "Kr.");
                break;
            case 2:
                System.out.println(" - The participating players are!");
                System.out.println(Player.playerList.get(0).playerName + ": " + Player.playerList.get(0).money + "Kr.");
                System.out.println(Player.playerList.get(1).playerName + ": " + Player.playerList.get(1).money + "Kr.");
                break;
            case 3:
                System.out.println(" - The participating players are!");
                System.out.println(Player.playerList.get(0).playerName + ": " + Player.playerList.get(0).money + "Kr.");
                System.out.println(Player.playerList.get(1).playerName + ": " + Player.playerList.get(1).money + "Kr.");
                System.out.println(Player.playerList.get(2).playerName + ": " + Player.playerList.get(2).money + "Kr.");
                break;
            case 4:
                System.out.println(" - The participating players are!");
                System.out.println(Player.playerList.get(0).playerName + ": " + Player.playerList.get(0).money + "Kr.");
                System.out.println(Player.playerList.get(1).playerName + ": " + Player.playerList.get(1).money + "Kr.");
                System.out.println(Player.playerList.get(2).playerName + ": " + Player.playerList.get(2).money + "Kr.");
                System.out.println(Player.playerList.get(3).playerName + ": " + Player.playerList.get(3).money + "Kr.");
        }
    }
    public Game(){
        Player.setPlayers();
        setRounds();
        displayAllPlayers(); /* medot mest för att se att det funkar */
        for(var round = 1; round <= rounds; round++){
            for(var player: Player.playerList){
                System.out.println("ROUND " + round + "/" + rounds);
                System.out.println("PLAYER: " + player.playerName);
                   Store.whatToDO(player);
            }

        }

        System.out.println(Player.playerList.get(0).playerName + ": " + Player.playerList.get(0).money + "Kr.");
    }
}
