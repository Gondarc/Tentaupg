package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Chicken extends Animal {
    static int cost = 25;
    static Chicken createChicken(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name your chicken and set it's gender! (Both followed by ENTER)");
        return new Chicken(scanner.next(), scanner.next(), "Chicken",100,25);
    }

    static Chicken breedChicken(){
        Scanner scanner = new Scanner(System.in);
        int i = (1) + (int) (Math.random() * (2 - 1 + 1));
        switch (i){
            case 1 -> { System.out.println("Name your new chicken!");
                return new Chicken(scanner.next(), "Male", "Chicken", 100, 50); }
            case 2 -> { System.out.println("Name your new chicken!");
                return new Chicken(scanner.next(), "Female", "Chicken", 100, 50); }
        }
        return breedChicken();
    }

    public Chicken(String name, String gender, String animalType, int health, int price) {
        super(name, gender, animalType, health, price);
    }
}
