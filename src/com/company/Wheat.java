package com.company;

public class Wheat extends Food{
    static int cost = 50;
    static Wheat createWheat(){
        return new Wheat("Wheat", 50, 50);
    }
    public Wheat(String foodName, int foodPrice, int foodHealth){
        super (foodName, foodPrice, foodHealth);
    }
}
