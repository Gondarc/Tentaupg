package com.company;
import java.lang.reflect.Array;
import java.util.*;

public class Player {
    static Scanner scanner = new Scanner(System.in);
    public String playerName;
    public int money;

    static ArrayList<Player> playerList = new ArrayList<>();
    ArrayList<Animals> animalList = new ArrayList<>();
    ArrayList<Food> foodList = new ArrayList<>();
    static Player player;

    static void setPlayers() {
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
    public Player(String playerName, int money){
        this.playerName = playerName;
        this.money = money;
    }
}
