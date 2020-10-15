package com.company;

import java.util.Scanner;

public class Moose extends Animal {
    static int cost = 75;
    static Moose createMoose(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name your moose and set it's gender! (Both followed by ENTER)");
        return new Moose(scanner.next(), scanner.next(),100,75);
    }
    public Moose(String name, String gender, int health, int price) {
        super(name, gender, health, price);
    }
}
