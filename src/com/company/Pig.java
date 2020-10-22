package com.company;
import java.util.*;

public class Pig extends Animal {
    static int cost = 50;
    static Pig createPig(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name your pig and set it's gender! (Both followed by ENTER)");
        return new Pig(scanner.next(), scanner.next(), "Pig",100,50);
    }
    public Pig(String name, String gender, String animalType, int health, int price) {
        super(name, gender,animalType, health, price);
    }
}
