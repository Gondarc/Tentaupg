package com.company;
import java.util.*;

public class Pig extends Animals {
    static void createPig(){
        Pig pig;
        ArrayList<Pig> animalList = new ArrayList<>();
        pig = new Pig("","",100,50);
    }
    public Pig(String name, String gender, int health, int price) {
        super(name, gender, health, price);
    }
}
