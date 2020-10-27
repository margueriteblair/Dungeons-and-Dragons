package com.margieblair;

import java.util.Random;

public class Die {
    private int sides;
    private int face;

    public Die() {
        sides = 20;
    }

    public int roll(Random rand) {
        face = rand.nextInt(sides) + 1;
        return face;
    }

}
