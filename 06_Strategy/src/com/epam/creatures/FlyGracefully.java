package com.epam.creatures;

public class FlyGracefully implements FlyBehavior {
    @Override
    public void performFly() {
        System.out.println("I fly gracefully");
    }
}
