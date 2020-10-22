package com.company;

import java.util.ArrayList;

public class Sugar extends Food{
    static int cost = 25;
    static Sugar createSugar(){
        return new Sugar("Sugar", 25, 10);
    }
    public Sugar(String foodName, int foodPrice, int foodHealth){
        super (foodName, foodPrice, foodHealth);
    }
}