package com.margieblair;

import java.util.Random;
public class Calculator {


    public static int attack(int ac, int defenseMod, int attackMod, String damageDice) {
        int numRolls = Integer.parseInt(damageDice.split("d")[0]);
        int damageDieNumSides = Integer.parseInt(damageDice.split("d")[1]);

        Die twentySided = new Die(20);
        Die damageDieHit = new Die(damageDieNumSides);
        Random rand = new Random();
        int hit = twentySided.roll(rand);
        System.out.println("Enemy rolled a " + hit);
        //make a try catch block with the numRolls and the catch portion will set numRolls = 1 if it's undefined
        if (hit == 20) {
            int firstRoll = 0;
            for (int i = 0; i < numRolls; i++) {
                firstRoll += damageDieHit.roll(rand);
            }
            int secondRoll = 0;
            for (int i = 0; i < numRolls; i++) {
                secondRoll += damageDieHit.roll(rand);
            }

            int totalDamage = firstRoll + secondRoll;
            System.out.println("Critical Hit! " + firstRoll + " + " + secondRoll + " = " + totalDamage + " damage");
            return totalDamage;
        }

        if (hit == 1) {
            System.out.println("Critical Miss!");
            return 0;
        }

        if (hit + attackMod > ac + defenseMod) {
            int totalDamage = damageDieHit.roll(rand);
            System.out.println("Hit " + totalDamage + " damage delt");
            return totalDamage;
        }
        System.out.println("Miss 0 damage");
        return 0;
    }

}
