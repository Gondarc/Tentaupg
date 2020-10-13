package com.company;

import java.util.ArrayList;

public class Sugar extends Food{
    static int cost = 50;
    static Sugar createSugar(){
        return new Sugar("Sugar", 50, 50);
    }
    public Sugar(String foodName, int foodPrice, int foodHealth){
        super (foodName, foodPrice, foodHealth);
    }
}