package com.epam.creatures;

public class Harpy extends Creature{
    public Harpy() {
        this.identification = "I am Harpy";

        this.flyBehavior = new FlyAwkward();
    }
}
