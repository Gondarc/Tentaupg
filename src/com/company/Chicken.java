package com.company;

import java.util.Scanner;

public class Chicken extends Animals{
    static int cost = 25;
    static Chicken createChicken(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name your hicken and set it's gender! (Both followed by ENTER)");
        return new Chicken(scanner.next(), scanner.next(),100,25);
    }
    public Chicken(String name, String gender, int health, int price) {
        super(name, gender, health, price);
    }
}
