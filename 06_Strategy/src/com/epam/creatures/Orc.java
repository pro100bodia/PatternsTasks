package com.epam.creatures;

public class Orc extends Creature{
    public Orc() {
        this.identification = "I am Orc";
        this.walkBehavior = new WalkWithExtremelyNoise();

    }
}
