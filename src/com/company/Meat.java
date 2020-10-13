package com.company;

public class Meat extends Food{
    static int cost = 50;
    static Meat createMeat(){
        return new Meat("Meat", 50, 50);
    }
    public Meat(String foodName, int foodPrice, int foodHealth){
        super (foodName, foodPrice, foodHealth);
    }
}
