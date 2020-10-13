package com.company;

public class Chicken extends Animals{
    static int cost = 25;
    static Chicken createChicken(){
        return new Chicken("","",100,25);
    }
    public Chicken(String name, String gender, int health, int price) {
        super(name, gender, health, price);
    }
}
