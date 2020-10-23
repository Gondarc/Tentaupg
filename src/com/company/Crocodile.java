package com.company;

import java.util.Scanner;

public class Crocodile extends Animal {
    static int cost = 100;
    static Crocodile createCrocodile(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name your crocodile and set it's gender! (Both followed by ENTER)");
        return new Crocodile(scanner.next(), scanner.next(), "Crocodile",100,100);
    }

    static Crocodile breedCrocodile(){
        Scanner scanner = new Scanner(System.in);
        int i = (1) + (int) (Math.random() * (2 - 1 + 1));
        switch (i){
            case 1 -> { System.out.println("Name your new crocodile!");
                return new Crocodile(scanner.next(), "Male", "Crocodile", 100, 50); }
            case 2 -> { System.out.println("Name your new crocodile!");
                return new Crocodile(scanner.next(), "Female", "Crocodile", 100, 50); }
        }
        return breedCrocodile();
    }

    public Crocodile(String name, String gender, String animalType, int health, int price) {
        super(name, gender, animalType, health, price);
    }
}
