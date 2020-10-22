package com.company;

public class Wheat extends Food{
    static int cost = 25;
    static Wheat createWheat(){
        return new Wheat("Wheat", 25, 10);
    }
    public Wheat(String foodName, int foodPrice, int foodHealth){
        super (foodName, foodPrice, foodHealth);
    }
}
