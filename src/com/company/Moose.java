package com.company;

public class Moose extends Animals{
    static int cost = 75;
    static Moose createMoose(){
        return new Moose("","",100,75);
    }
    public Moose(String name, String gender, int health, int price) {
        super(name, gender, health, price);
    }
}
