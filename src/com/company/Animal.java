package com.company;
import java.util.*;

public class Animal {
    String name;
    String gender;
    String animalType;
    int health;
    int price;

    public Animal(String name, String gender, String animalType, int health, int price){
        this.health = health;
        this.gender = gender;
        this.animalType = animalType;
        this.name = name;
        this.price = price;
    }

    public void breed(Player player){
        int i = (1) + (int) (Math.random() * (8 - 1 + 1));
    }

    public void feed(Food food){
        health += food.foodHealth;
        if (health > 100){ health = 100; }
    }

    public void decreaseHealth(){
        int i = (10) + (int) (Math.random() * (30 - 10 + 1));
        health -= i;
        if(health < 0){ health = 0; }
    }

    public boolean isDead(){
        return health == 0;
    }

}
