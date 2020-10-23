package com.company;

import java.util.Scanner;

public class Moose extends Animal {
    static int cost = 75;
    static Moose createMoose(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name your moose and set it's gender! (Both followed by ENTER)");
        return new Moose(scanner.next(), scanner.next(), "Moose" ,100,75);
    }

    static Moose breedMoose(){
        Scanner scanner = new Scanner(System.in);
        int i = (1) + (int) (Math.random() * (2 - 1 + 1));
        switch (i){
            case 1 -> { System.out.println("Name your new moose!");
                return new Moose(scanner.next(), "Male", "Moose", 100, 50); }
            case 2 -> { System.out.println("Name your new moose!");
                return new Moose(scanner.next(), "Female", "Moose", 100, 50); }
        }
        return breedMoose();
    }

    public Moose(String name, String gender, String animalType, int health, int price) {
        super(name, gender, animalType, health, price);
    }
}
