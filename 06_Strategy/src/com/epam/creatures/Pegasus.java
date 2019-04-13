package com.epam.creatures;

public class Pegasus extends Creature{
    public Pegasus() {
        this.identification = "I am Pagasus";
        this.flyBehavior = new FlyGracefully();
    }
}
