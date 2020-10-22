package com.company;

public class Meat extends Food{
    static int cost = 25;
    static Meat createMeat(){
        return new Meat("Meat", 25, 10);
    }
    public Meat(String foodName, int foodPrice, int foodHealth){
        super (foodName, foodPrice, foodHealth);
    }
}
