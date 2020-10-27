package com.margieblair;

import java.util.Random;
public class Calculator {


    public static int attack(int ac, int defenseMod, int attackMod, String damageDice) {
        //this method should return the damage
        //AC stands for armor class and is an integer
        Die twentySided = new Die(20);
        Die damageDie = new Die(4);
        Random rand = new Random();
        int hit = twentySided.roll(rand);
        if (hit == 20) {
            int firstRoll = damageDie.roll(rand);
            int secondRoll = damageDie.roll(rand);
            int totalDamage = firstRoll + secondRoll;
            System.out.println("Critical Hit! " + firstRoll + " + " + secondRoll + " = " + totalDamage + " damage");
            return totalDamage;
        }

        if (hit == 1) {
            System.out.println("Critical Miss!");
            return 0;
        }

        if (hit + attackMod > ac + defenseMod) {
            int totalDamage = damageDie.roll(rand);
            System.out.println("Hit " + totalDamage + " damage delt");
        }
        System.out.println("Miss 0 damage");
        return 0;
    }

}
