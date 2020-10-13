package com.company;

public class Crocodile extends Animals{
    static int cost = 100;
    static Crocodile createCrocodile(){
        return new Crocodile("","",100,100);
    }
    public Crocodile(String name, String gender, int health, int price) {
        super(name, gender, health, price);
    }
}
