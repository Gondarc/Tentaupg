package com.company;
import java.util.*;
import java.lang.Math;

public class Game {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Player> playerList = new ArrayList<>();
    Player player;

    private void playerChoice() {
        System.out.println(" - What should you do? \n - Buy or sell an Animal or do you wish to buy animal food?");
        int playerDecision = scanner.nextInt();
        switch (playerDecision){
            case 1:
                System.out.println(" - Which animal do you want to buy");
                System.out.println(" - Pig: 100Kr Horse: 200Kr Chicken: 50Kr");
                System.out.println(" - press (1) for pig, (2) for horse, (3) for a chicken...");
                playerDecision = scanner.nextInt();
                switch (playerDecision){
                    case 1:
                        Collections.swap(playerList, 0, 1);
                        System.out.println("You bought a Pig, Oink!");
                        //try to change the value of a players currency after buying something!!!
                }
                break;
            case 2:
                System.out.println(" - Sell animal");
                break;
            case 3:
                System.out.println(" - Buy food");
                break;
            default:
                playerChoice();
                break;
        }
    }

    private void setPlayers() {
        System.out.println(" - How many players will play?");
        System.out.println(" - Choose from 1, 2, 3 or 4.");
        int players = Integer.parseInt(scanner.nextLine()) ;
//        scanner.nextLine();
        switch(players){
            case 1:
                System.out.println(" - Choose your name player1");
                player = new Player(scanner.nextLine(), 1000);
                playerList.add(player);
                break;
            case 2:
                System.out.println(" - Chooses your name player1 and player2");
                player = new Player(scanner.nextLine(), 1000);
                playerList.add(player);
                player = new Player(scanner.nextLine(), 1000);
                playerList.add(player);
                break;
            case 3:
                System.out.println(" - Chooses your name player1, player2 and player3");
                player = new Player(scanner.nextLine(), 1000);
                playerList.add(player);
                player = new Player(scanner.nextLine(), 1000);
                playerList.add(player);
                player = new Player(scanner.nextLine(), 1000);
                playerList.add(player);
                break;
            case 4:
                System.out.println(" - Chooses your name player1, player2, player3 and player4");
                player = new Player(scanner.nextLine(), 1000);
                playerList.add(player);
                player = new Player(scanner.nextLine(), 1000);
                playerList.add(player);
                player = new Player(scanner.nextLine(), 1000);
                playerList.add(player);
                player = new Player(scanner.nextLine(), 1000);
                playerList.add(player);
                break;
            default:
                System.out.println("FUNKY-FRESH");
                setPlayers();
        }
    }
    private void setRounds(){
        int rounds;
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
        switch (playerList.size()){
            case 1:
                System.out.println("Chosen player is : ");
                System.out.println(playerList.get(0).playerName + ": " + playerList.get(0).money + "Kr.");
                break;
            case 2:
                System.out.println("The participating players are!");
                System.out.println(playerList.get(0).playerName + ": " + playerList.get(0).money + "Kr.");
                System.out.println(playerList.get(1).playerName + ": " + playerList.get(1).money + "Kr.");
                break;
            case 3:
                System.out.println("The participating players are!");
                System.out.println(playerList.get(0).playerName + ": " + playerList.get(0).money + "Kr.");
                System.out.println(playerList.get(1).playerName + ": " + playerList.get(1).money + "Kr.");
                System.out.println(playerList.get(2).playerName + ": " + playerList.get(2).money + "Kr.");
                break;
            case 4:
                System.out.println("The participating players are!");
                System.out.println(playerList.get(0).playerName + ": " + playerList.get(0).money + "Kr.");
                System.out.println(playerList.get(1).playerName + ": " + playerList.get(1).money + "Kr.");
                System.out.println(playerList.get(2).playerName + ": " + playerList.get(2).money + "Kr.");
                System.out.println(playerList.get(3).playerName + ": " + playerList.get(3).money + "Kr.");
        }
    }


    public Game(){
        setPlayers();
        setRounds();
        displayAllPlayers(); /* medot mest för att se att det funkar */
        playerChoice();
    }
}
