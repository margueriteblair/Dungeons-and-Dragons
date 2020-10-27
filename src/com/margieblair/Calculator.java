package com.margieblair;

import java.util.Random;
public class Calculator {


    public void attack(int ac, int defenseMod, int attackMod, String damageDice) {
        //this method should return the damage
        //AC stands for armor class and is an integer
        Die die = new Die(20);
        DamageDice damageDie = new DamageDice(4);
        Random rand = new Random();
        int hit = damageDie.roll(rand);
        if (hit == 20) {
            int firstRoll = damageDie.roll(rand);
            int secondRoll = damageDie.roll(rand);

        }
    }

}
