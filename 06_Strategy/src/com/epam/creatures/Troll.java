package com.epam.creatures;

public class Troll extends Creature {
    public Troll() {
        this.identification = "I am Troll";
        this.walkBehavior = new WalkWithExtremelyNoise();

    }
}
