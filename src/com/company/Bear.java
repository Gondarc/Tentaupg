package com.company;

public class Bear extends Animals{
    static int cost = 85;
    static Bear createBear(){
        return new Bear("","",100,85);
    }
    public Bear(String name, String gender, int health, int price) {
        super(name, gender, health, price);
    }
}
