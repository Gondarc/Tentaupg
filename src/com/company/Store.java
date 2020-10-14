package com.company;
import java.util.*;

public class Store {
    static Scanner scanner = new Scanner(System.in);
    String buyAnimal;
    String sellAnimal;
    String buyFood;

    static void sellAnimal(Player player){
        for (var animal: player.animalList){
            System.out.println(animal.name + " " + animal.gender);
        }
        var sellIndex = Dialogs.promptInt("Which animal do you want to sell?",1,player.animalList.size());
        player.animalList.remove(sellIndex - 1);
        var playerChoice = Dialogs.promptInt("Do you wanna sell another animal? (1) yes (2) no", 1,2);
        switch (playerChoice){
            case 1: sellAnimal(player);
            case 2: break;
        }
    }
    static void buyFood(Player player) {
        var foodTypes = "Sugar, meat, wheat".split(", ");
        var foodNumber = Dialogs.promptInt(" - Buy -\n - (1) Sugar, (2) meat, (3) wheat", 1, 3);
        switch (foodNumber) {
            case 1:
                if (player.money >= Sugar.cost) {
                    player.foodList.add(Sugar.createSugar());
                    player.money -= Sugar.cost;
                    switch (Dialogs.promptInt(" - Buy more food?\n - (1) Buy more\n - (2) Continue to next player", 1, 2)) {
                        case 1:
                            buyFood(player);
                        case 2:
                            break;
                    }
                } else {
                    System.out.println("Not enough money, maybe sell an animal?");
                    whatToDO(player);
                }
                break;
            case 2:
                if (player.money >= Meat.cost) {
                    player.foodList.add(Meat.createMeat());
                    player.money -= Meat.cost;
                    switch (Dialogs.promptInt(" - Buy more food?\n - (1) Buy more\n - (2) Continue to next player", 1, 2)) {
                        case 1:
                            buyFood(player);
                        case 2:
                            break;
                    }
                } else {
                    System.out.println("Not enough money, maybe sell an animal?");
                    whatToDO(player);
                }
                break;
            case 3:
                if (player.money >= Wheat.cost) {
                    player.foodList.add(Wheat.createWheat());
                    player.money -= Wheat.cost;
                    switch (Dialogs.promptInt(" - Buy more food?\n - (1) Buy more\n - (2) Continue to next player", 1, 2)) {
                        case 1:
                            buyFood(player);
                        case 2:
                            break;
                    }
                } else {
                    System.out.println("Not enough money, maybe sell an animal?");
                    whatToDO(player);
                }
                break;
        }
    }
    static void buyAnimal(Player player){
        var animalTypes = "pig, chicken, moose, crocodile, near".split(", ");
        var animalNumber = Dialogs.promptInt(" - Buy -\n - (1) Pig, (2) Chicken, (3) Moose (4) Crocodile (5) Bear", 1, 5);
        /*var name = Dialogs.prompt("What is the name of your new " + animalTypes[animalNumber - 1] + "?");
        var gender = Dialogs.promptChoice("What gender does " + name + " have?", "male", "female");

         */

        switch (animalNumber){
            case 1:
                if (player.money >= Pig.cost){
                    player.animalList.add(Pig.createPig());
                    player.money -= Pig.cost;
                    switch (Dialogs.promptInt(" - Buy more animal's?\n - (1) Buy more\n - (2) Continue to next player",1,2)) {
                        case 1: buyAnimal(player);
                        case 2: break;
                    }
                } else {
                    System.out.println("Not enough money, maybe sell an animal?");
                    whatToDO(player);
                }
                break;
            case 2:
                if (player.money >= Chicken.cost) {
                    player.animalList.add(Chicken.createChicken());
                    player.money -= Chicken.cost;
                    switch (Dialogs.promptInt(" - Buy more animal's?\n - (1) Buy more\n - (2) Continue to next player", 1, 2)) {
                        case 1: buyAnimal(player);
                        case 2: break;
                    }
                } else {
                    System.out.println("Not enough money, maybe sell an animal?");
                    whatToDO(player);
                }
                break;
            case 3:
                if (player.money >= Moose.cost) {
                    player.animalList.add(Moose.createMoose());
                    player.money -= Moose.cost;
                    switch (Dialogs.promptInt(" - Buy more animal's?\n - (1) Buy more\n - (2) Continue to next player", 1, 2)) {
                        case 1: buyAnimal(player);
                        case 2: break;
                    }
                } else {
                    System.out.println("Not enough money, maybe sell an animal?");
                    whatToDO(player);
                }
                break;
            case 4:
                if (player.money >= Crocodile.cost) {
                    player.animalList.add(Crocodile.createCrocodile());
                    player.money -= Crocodile.cost;
                    switch (Dialogs.promptInt(" - Buy more animal's?\n - (1) Buy more\n - (2) Continue to next player", 1, 2)) {
                        case 1: buyAnimal(player);
                        case 2: break;
                    }
                } else {
                    System.out.println("Not enough money, maybe sell an animal?");
                    whatToDO(player);
                }
                break;
            case 5:
                if (player.money >= Bear.cost) {
                    player.animalList.add(Bear.createBear());
                    player.money -= Bear.cost;
                    switch (Dialogs.promptInt(" - Buy more animal's?\n - (1) Buy more\n - (2) Continue to next player", 1, 2)) {
                        case 1: buyAnimal(player);
                        case 2: break;
                    }
                } else {
                    System.out.println("Not enough money, maybe sell an animal?");
                    whatToDO(player);
                }
                break;
        }
    }
    static void whatToDO(Player player){
        switch (Dialogs.promptInt(" - (1) Buy animal\n - (2) Buy food\n - (3) Sell animal",1,3)){
            case 1:
                buyAnimal(player);
                break;
            case 2 :
                buyFood(player);
                break;
            case 3 :
                sellAnimal(player);
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
