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
            System.out.println("Great! Now input your defense mod:");
            int defenseMod = scanner.nextInt();
            System.out.println("Input the attack mod:");
            int attackMod = scanner.nextInt();
            System.out.println("Please give us what kind of die you'll be rolling for damage hits: ");
            String damageDice = scanner.next();
            int damage = Calculator.attack(ac, defenseMod, attackMod, damageDice);
            System.out.println(damage);
        }
    }
}
