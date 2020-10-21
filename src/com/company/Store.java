package com.company;
import java.util.*;

public class Store {
    static Scanner scanner = new Scanner(System.in);
    String buyAnimal;
    String sellAnimal;
    String buyFood;

    static void sellAnimal(Player player){
            for (var animal : player.animalList) {
                var animalIndex = player.animalList.indexOf(animal) + 1;
                System.out.println("(" + animalIndex + ") "  + animal.name + " " + animal.gender);
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
        var foodNumber = Dialogs.promptInt(" - Buy - \n - (1) Sugar\n - (2) Meat\n - (3) Wheat", 1, 3);
        int[] costs = {Sugar.cost, Meat.cost, Wheat.cost};
        var cost = costs[foodNumber - 1];
        var maxFoodBuy = player.money / cost;
        if (player.money >= cost) {
        var foodAmount = Dialogs.promptInt(" - How many KG/amount of do you wish too buy?" +
                "\n - Lowest amount (1KG), Highest amount (" + maxFoodBuy + "KG), (0) Go back", 1, maxFoodBuy);
            int i = 0;
            Food newFood = null;
                switch (foodNumber) {
                    case 1 -> {
                        while (foodAmount > i){
                            newFood = Sugar.createSugar();
                            player.money -= cost;
                            player.foodList.add(newFood);
                            i++;
                        }
                    }
                    case 2 -> {
                        while (foodAmount > i){
                            newFood = Meat.createMeat();
                            player.money -= cost;
                            player.foodList.add(newFood);
                            i++;
                        }
                    }
                    case 3 -> {
                        while (foodAmount > i){
                            newFood = Wheat.createWheat();
                            player.money -= cost;
                            player.foodList.add(newFood);
                            i++;
                        }
                    }
                }
            if (Dialogs.promptInt(
                    " - Buy more food?\n - (1) Buy more\n - (2) Continue to next player", 1, 2) == 1) {
                buyFood(player);
            }
        } else {
            System.out.println("Not enough money, maybe sell an animal?");
            System.out.println("You have " + player.money + " currency");
            whatToDO(player);
        }
    }

    static void buyAnimal(Player player) {
        var animalNumber = Dialogs.promptInt(" - Buy -\n" +
                " - (1) Pig, (2) Chicken, (3) Moose (4) Crocodile (5) Bear", 1, 5);

        int[] costs = {Pig.cost, Chicken.cost, Moose.cost, Crocodile.cost, Bear.cost};
        var cost = costs[animalNumber - 1];
        if (player.money >= cost) {
            Animal newAnimal = null;
            switch (animalNumber) {
                case 1 -> newAnimal = Pig.createPig();
                case 2 -> newAnimal = Chicken.createChicken();
                case 3 -> newAnimal = Moose.createMoose();
                case 4 -> newAnimal = Crocodile.createCrocodile();
                case 5 -> newAnimal = Bear.createBear();
            }
            player.money -= cost;
            player.animalList.add(newAnimal);
            if(Dialogs.promptInt(
                " - Buy more animal's?\n - (1) Buy more\n - (2) Continue to next player", 1, 2) == 1) {
                buyAnimal(player);
            }
        }
        else {
            System.out.println("Not enough money, maybe sell an animal?");
            whatToDO(player);
        }
    }

    static void whatToDO(Player player){
        switch (Dialogs.promptInt(" - (1) Buy animal\n - (2) Buy food\n - (3) Sell animal\n - (4) Breed animal\n",1,4)){
            case 1:
                buyAnimal(player);
                break;
            case 2 :
                buyFood(player);
                break;
            case 3 :
                sellAnimal(player);
                break;
            case 4:
                //Animals.breedAnimal(player);                // lös detta sen bramski
                break;
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
