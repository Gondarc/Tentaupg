package com.company;
import java.util.*;

public class Pig extends Animal {
    static int cost = 50;
    static Pig createPig(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name your pig and set it's gender! (Both followed by ENTER)");
        return new Pig(scanner.next(), scanner.next(), "Pig",100,50);
    }
    static Pig breedPig(){
        Scanner scanner = new Scanner(System.in);
        int i = (1) + (int) (Math.random() * (2 - 1 + 1));
        switch (i){
            case 1 -> { System.out.println("Name your new pig!");
                return new Pig(scanner.next(), "Male", "Pig", 100, 50); }
            case 2 -> { System.out.println("Name your new pig!");
                return new Pig(scanner.next(), "Female", "Pig", 100, 50); }
        }
        return breedPig();
    }

    public Pig(String name, String gender, String animalType, int health, int price) {
        super(name, gender,animalType, health, price);
    }
}
