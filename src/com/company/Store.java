package com.company;
import java.util.*;

public class Store {
    static Scanner scanner = new Scanner(System.in);
    String buyAnimal;
    String sellAnimal;
    String buyFood;

    static void buyAnimal(){
        var animalTypes = "pig, chicken, moose, crocodile, near".split(", ");
        var animalNumber = Dialogs.promptInt(" - Buy -\n - (1) Pig, (2) Chicken, (3) Moose (4) Crocodile (5) Bear", 1, 5);
        var name = Dialogs.prompt("What is the name of your new " + animalTypes[animalNumber - 1] + "?");
        var gender = Dialogs.promptChoice("What gender does " + name + " have?", "male", "female");
        switch (animalNumber){
            case 1:
                new Pig(name,gender,100,50);
                break;
            case 2:
            case 3:
            case 4:
            case 5:
        }
    }

    static void whatToDO(Player player){
        System.out.println(" - (1) Buy animal\n - (2) Buy food\n - (3) Sell animal");
        switch (scanner.nextInt()){
            case 1:
                buyAnimal();
                switch (scanner.nextInt()){
                    case 1:
                }
                break;
            case 2 :
                System.out.println("lakktjooo");
                break;
            case 3 :
                System.out.println("habibiii");
            default:
                whatToDO(player);
        }
    }

    public Store(String buyAnimal, String sellAnimal, String buyFood){
        this.buyAnimal = buyAnimal;
        this.sellAnimal = sellAnimal;
        this.buyFood = buyFood;
    }

}
