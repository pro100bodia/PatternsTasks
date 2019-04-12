package com.epam.creatures;

public class FlyAwkward implements FlyBehavior {
    @Override
    public void performFly() {
        System.out.println("I fly awkward");
    }
}
