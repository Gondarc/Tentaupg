package com.company;
import java.util.*;

public class Player {

    public String playerName;
    public int money;

    ArrayList<Animal> animalList = new ArrayList<>();
    ArrayList<Food> foodList = new ArrayList<>();

    public Player(String playerName, int money){
        this.playerName = playerName;
        this.money = money;
    }
}
