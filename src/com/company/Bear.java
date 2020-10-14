package com.company;

import java.util.Scanner;

public class Bear extends Animals{
    static int cost = 85;
    static Bear createBear(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name your bear and set it's gender! (Both followed by ENTER)");
        return new Bear(scanner.next(), scanner.next(),100,85);
    }
    public Bear(String name, String gender, int health, int price) {
        super(name, gender, health, price);
    }
}