package com.margieblair;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Dungeons and Dragons Baby!");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        while(true) {
            System.out.println("Player, input your Armor Class (Between 10-18):");
            int ac = scanner.nextInt();
            System.out.println("Great! Now input your defense mod (-50-50):");
            int defenseMod = scanner.nextInt();
            System.out.println("Input the attack mod (-50-50):");
            int attackMod = scanner.nextInt();
            System.out.println("Please give us what kind of die you'll be rolling for damage hits format-{X}d{Y}: ");
            String damageDice = scanner.next();
            int damage = Calculator.attack(ac, defenseMod, attackMod, damageDice);
            System.out.println(damage + " is the final total damage for this roll!");
        }
    }
}
