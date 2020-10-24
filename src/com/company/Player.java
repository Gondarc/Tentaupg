package com.company;
import java.util.*;

public class Player {

    public String playerName;
    public int money;

    ArrayList<Animal> animalList = new ArrayList<>();
    ArrayList<Food> foodList = new ArrayList<>();

    public Player(String playerName, int money){
        this.playerName = playerName;
        this.money = money;
    }

    static void sellAllAnimals(Player player){
        for (var animal : player.animalList) {
            var animalWorth = (animal.price * animal.health) / 100;
            player.money += animalWorth;
        }
    }

    public void decreaseAnimalsHealth(){
        var deadAnimals = new ArrayList<Animal>();
        // Decrease the health for each of the players animal
        // and remember which animals that dies after that
        for(var animal : animalList){
            animal.decreaseHealth();
            if(animal.isDead()){ deadAnimals.add(animal); }
        }
        // Remove dead animals
        if(deadAnimals.size() > 0){
            System.out.println("\nSorry " + playerName + ", these animals have died:");
        }
        for(var deadAnimal: deadAnimals){
            animalList.remove(deadAnimal);
            System.out.println(deadAnimal.name);
        }
    }
}
