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
    public Chicken(String name, String gender, String animalType, int health, int price) {
        super(name, gender, animalType, health, price);
    }
}
