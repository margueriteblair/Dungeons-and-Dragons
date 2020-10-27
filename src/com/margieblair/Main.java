package com.margieblair;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Dungeons and Dragons Baby!");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        while(true) {
            System.out.println("Player, input your Armor Class:");
            int ac = scanner.nextInt();
            System.out.println("Great! Now input your defense Mod:");
            int defenseMod = scanner.nextInt();
            Die damageDie = new Die(4);
            int attackMod = (damageDie.roll(random)) * 2;
            Calculator.attack(ac, defenseMod, attackMod, "hi");
        }
    }
}
