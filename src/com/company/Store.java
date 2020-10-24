package com.company;
import java.util.*;

public class Store {
    static Scanner scanner = new Scanner(System.in);
    String buyAnimal;
    String sellAnimal;
    String buyFood;

    static void breedAnimal(Player player) {
        Animal firstAnimal = null;
        Animal secondAnimal = null;
        Animal newAnimal = null;
        int i = 0;
        int j = 0;
        if (player.animalList.size() >= 2) {
        System.out.println(" - Which animal do you wish too breed?");
            for (var animal : player.animalList) {
                System.out.println(" - (" + i + ")[" + animal.animalType + "][" + animal.name + "][" + animal.gender + "][Health: " + animal.health + "]");
                i++;
            }
        } else {
            System.out.println(" - You have less then 2 animals, which tells me you cant breed anything... yet!");
            System.out.println(" - I recommend buying more animals so you can start breeding!");
            whatToDO(player);
        }
        firstAnimal = player.animalList.get(scanner.nextInt());
        System.out.println(" - Choose your second animal to breed " + firstAnimal.name + " with");
        for (var animal : player.animalList) {
            System.out.println(" - (" + j + ")[" + animal.animalType + "][" + animal.name + "][" + animal.gender + "][Health: " + animal.health + "]");
            j++;
        }

        var breedPreferences = new HashMap<String, String>();
        breedPreferences.put("Pig", "Pig");
        breedPreferences.put("Chicken", "Chicken");
        breedPreferences.put("Moose", "Moose");
        breedPreferences.put("Crocodile", "Crocodile");
        breedPreferences.put("Bear", "Bear");
        int breedSuccess = (1) + (int) (Math.random() * (2 - 1 + 1));
        var animalsCanBreed = breedPreferences.get(firstAnimal.animalType);
        secondAnimal = player.animalList.get(scanner.nextInt());
        if (firstAnimal != secondAnimal) {
            if (animalsCanBreed.contains(secondAnimal.animalType)) {
                if (animalsCanBreed.contains("Pig")) {
                    if (breedSuccess == 1) {
                        System.out.println(" - Breed success");
                        int randomNmb = (1) + (int) (Math.random() * (6 - 1 + 1));
                        System.out.println("You got " + randomNmb + " new pigs");
                        for (int randomInt = 0; randomInt < randomNmb; randomInt++) {
                            newAnimal = Pig.breedPig();
                            player.animalList.add(newAnimal);
                        }
                    } else {
                        System.out.println(" - Unfortunately the breeding didn't succeed");
                    }
                }
                if (animalsCanBreed.contains("Chicken")) {
                    if (breedSuccess == 1) {
                        System.out.println(" - Breed success");
                        int randomNmb = (1) + (int) (Math.random() * (3 - 1 + 1));
                        System.out.println("You got " + randomNmb + " new chickens");
                        for (int randomInt = 0; randomInt < randomNmb; randomInt++) {
                            newAnimal = Chicken.breedChicken();
                            player.animalList.add(newAnimal);
                        }
                    } else {
                        System.out.println(" - Unfortunately the breeding didn't succeed");
                    }
                }
                if (animalsCanBreed.contains("Crocodile")) {
                    if (breedSuccess == 1) {
                        System.out.println(" - Breed success");
                        int randomNmb = (1) + (int) (Math.random() * (6 - 1 + 1));
                        System.out.println("You got " + randomNmb + " new crocodiles");
                        for (int randomInt = 0; randomInt < randomNmb; randomInt++) {
                            newAnimal = Crocodile.breedCrocodile();
                            player.animalList.add(newAnimal);
                        }
                    } else {
                        System.out.println(" - Unfortunately the breeding didn't succeed");
                    }
                }
                if (animalsCanBreed.contains("Moose")) {
                    if (breedSuccess == 1) {
                        System.out.println(" - Breed success");
                        int randomNmb = (1) + (int) (Math.random() * (2 - 1 + 1));
                        System.out.println("You got " + randomNmb + " new moose");
                        for (int randomInt = 0; randomInt < randomNmb; randomInt++) {
                            newAnimal = Moose.breedMoose();
                            player.animalList.add(newAnimal);
                        }
                    } else {
                        System.out.println(" - Unfortunately the breeding didn't succeed");
                    }
                }
                if (animalsCanBreed.contains("Bear")) {
                    if (breedSuccess == 1) {
                        System.out.println(" - Breed success");
                        int randomNmb = (1) + (int) (Math.random() * (3 - 1 + 1));
                        System.out.println("You got " + randomNmb + " new bears");
                        for (int randomInt = 0; randomInt < randomNmb; randomInt++) {
                            newAnimal = Bear.breedBear();
                            player.animalList.add(newAnimal);
                        }
                    } else {
                        System.out.println(" - Unfortunately the breeding didn't succeed");
                    }
                }
            } else {
                System.out.println(" - You cant breed a " + firstAnimal.animalType + " with a " + secondAnimal.animalType);
                breedAnimal(player);
            }
        } else {
            System.out.println(" - You cant breed " + firstAnimal.name + " with " + secondAnimal.name);
            breedAnimal(player);
        }
    }

    static void feedAnimal(Player player) {
        Animal selectedAnimal = null;
        Food selectedFood = null;
        int i = 0;
        int j = 0;
        if (player.foodList.size() >= 1) {
            if (player.animalList.size() >= 1) {
                System.out.println("Which animal do you wish too feed?");
                for (var animal : player.animalList) {
                    System.out.println(" - (" + i + ")[" + animal.animalType + "][" + animal.name + "][" + animal.gender + "][Health: " + animal.health + "]");
                    i++;
                }
            } else {
                System.out.println(" - You don't have any animals too feed");
                System.out.println(" - You should rethink what you would want too do!");
            }
        } else {
            System.out.println(" - You don't have any food so you cant feed any of your animals");
            System.out.println(" - Rethink what you want too do!");
            whatToDO(player);
        }
        selectedAnimal = player.animalList.get(scanner.nextInt());
        System.out.println("which food do you wish to feed " + selectedAnimal.name + " with?");
        for (var food : player.foodList) {
            System.out.println(" - (" + j + ")[" + food.foodName + "]");
            j++;
        }

        var foodPreferences = new HashMap<String, String>();
        foodPreferences.put("Wheat", "Pig Chicken Moose Crocodile");
        foodPreferences.put("Meat", "Bear Crocodile Pig");
        foodPreferences.put("Sugar", "Bear Chicken Crocodile");

        selectedFood = player.foodList.get(scanner.nextInt());

        var animalsThatEatSelectedFood = foodPreferences.get(selectedFood.foodName);
        if (animalsThatEatSelectedFood.contains(selectedAnimal.animalType)) {
            // yes the animal can eat the food
            selectedAnimal.feed(selectedFood);
            player.foodList.remove(selectedFood);
            System.out.println("You fed" + selectedAnimal.name + " Health: " + selectedAnimal.health);
            var question = Dialogs.promptInt("(1) Feed more, (2) Continue / Next round", 1, 2);
            switch (question) {
                case 1 -> feedAnimal(player);
                default -> {
                    return;
                }
            }
        } else {
            // no the animal can't eat the food
            System.out.println("That animal can't eat that food.");
            whatToDO(player);
            return;
        }
    }

    static void animalStatus(Player player) {
        if (player.animalList.size()!=0) {
            System.out.println(" - " + player.playerName + "'s animals");
            for (var animal : player.animalList) {
                System.out.println(" - [" + animal.animalType + "][" + animal.name + "][" + animal.gender + "][Health: " + animal.health + "]");
            }
        } else {
            System.out.println(" - You don't own any animals!");
            System.out.println(" - Try too buy an animal and then use this feature!");
        }
        whatToDO(player);
    }

    static void sellAnimal(Player player) {
        if (player.animalList.size() != 0) {
            System.out.println(" - Your animals");
            for (var animal : player.animalList) {
                var animalIndex = player.animalList.indexOf(animal) + 1;
                System.out.println("(" + animalIndex + ") [" + animal.name + "][" + animal.gender + "][Health: " + animal.health + "]");
            }
            var sellIndex = Dialogs.promptInt(" - Which animal do you want to sell?", 1, player.animalList.size());
            var animalWorth = (player.animalList.get(sellIndex -1).price * player.animalList.get(sellIndex -1).health) / 100;
            player.money += animalWorth;
            player.animalList.remove(sellIndex - 1);
            var sellMore = Dialogs.promptInt(" - Do you wish to sell more animals? (1) Sell more, (2) Continue", 1,2);
            switch (sellMore){
                case 1 -> sellAnimal(player);
            }
        } else {
            System.out.println(" - You don't have any animals");
            System.out.println(" - You might wanna buy some more before trying to sell them!");
            whatToDO(player);
        }
    }

    static void buyFood(Player player) {
        var foodNumber = Dialogs.promptInt(" - Buy - \n - (1) Sugar\n - (2) Meat\n - (3) Wheat\n", 1, 3);
        int[] costs = {Sugar.cost, Meat.cost, Wheat.cost};
        var cost = costs[foodNumber - 1];
        var maxFoodBuy = player.money / cost;
        if (player.money >= cost) {
        var foodAmount = Dialogs.promptInt(" - How many KG/amount of do you wish too buy?" +
                "\n - Lowest amount (1KG), Highest amount (" + maxFoodBuy + "KG)", 1, maxFoodBuy);
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
        var animalNumber = Dialogs.promptInt("\n - Buy -\n" +
                " - (1) Pig, (2) Chicken, (3) Moose, (4) Crocodile, (5) Bear", 1, 5);

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
                switch (Dialogs.promptInt(
                        " - Buy more animal's?\n - (1) Buy more\n - (2) Continue to next player", 1, 2)) {
                    case 1 -> buyAnimal(player);
                }
        } else {
            System.out.println("Not enough money, maybe sell an animal?");
            whatToDO(player);
        }
    }

    static void whatToDO(Player player){
        switch (Dialogs.promptInt("\n - (1) Buy animal\n - (2) Buy food\n - (3) Sell animal\n - (4) Breed animal\n" +
                " - (5) Feed animal\n - (6) Your animal status",1,6)){
            case 1 -> buyAnimal(player);
            case 2 -> buyFood(player);
            case 3 -> sellAnimal(player);
            case 4 -> breedAnimal(player);
            case 5 -> feedAnimal(player);
            case 6 -> Store.animalStatus(player);
        }
    }

    public Store(String buyAnimal, String sellAnimal, String buyFood){
        this.buyAnimal = buyAnimal;
        this.sellAnimal = sellAnimal;
        this.buyFood = buyFood;
    }
}
