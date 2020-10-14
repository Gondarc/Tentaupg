package com.company;

import java.util.Scanner;

public class Crocodile extends Animals{
    static int cost = 100;
    static Crocodile createCrocodile(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name your crocodile and set it's gender! (Both followed by ENTER)");
        return new Crocodile(scanner.next(), scanner.next(),100,100);
    }
    public Crocodile(String name, String gender, int health, int price) {
        super(name, gender, health, price);
    }
}
