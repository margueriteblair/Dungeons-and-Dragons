package com.margieblair;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
	// write your code here
        Die die = new Die(20);

        for (int i = 0; i < 5; i++) {
            System.out.println(die.roll(rand));
            //rolling a twenty sided die
        }
    }
}
