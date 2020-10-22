package com.company;

import java.util.Scanner;

public class Crocodile extends Animal {
    static int cost = 100;
    static Crocodile createCrocodile(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name your crocodile and set it's gender! (Both followed by ENTER)");
        return new Crocodile(scanner.next(), scanner.next(), "Crocodile",100,100);
    }
    public Crocodile(String name, String gender, String animalType, int health, int price) {
        super(name, gender, animalType, health, price);
    }
}
