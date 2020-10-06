package com.company;
import java.util.*;

public class Player {
    Scanner scanner = new Scanner(System.in);
    public String playerName;
    public int money;

    public Player(String playerName, int money){
        this.playerName = playerName;
        this.money = money;
    }
}
