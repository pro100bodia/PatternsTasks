package com.epam.creatures;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void performFly() {
        System.out.println("I can`t fly");
    }
}
