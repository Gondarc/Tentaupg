package com.company;

import java.util.Scanner;

public class Bear extends Animal {
    static int cost = 85;
    static Bear createBear(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name your bear and set it's gender! (Both followed by ENTER)");
        return new Bear(scanner.nextLine(), scanner.nextLine(),  "Bear",100,85);
    }

    static Bear breedBear(){
        Scanner scanner = new Scanner(System.in);
        int i = (1) + (int) (Math.random() * (2 - 1 + 1));
        switch (i){
            case 1 -> { System.out.println("Name your new bear!");
                return new Bear(scanner.next(), "Male", "Bear", 100, 50); }
            case 2 -> { System.out.println("Name your new bear!");
                return new Bear(scanner.next(), "Female", "Bear", 100, 50); }
        }
        return breedBear();
    }

    public Bear(String name, String gender, String animalType, int health, int price) {
        super(name, gender, animalType, health, price);
    }
}