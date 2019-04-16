package com.epam.creatures;

public class Walk implements WalkBehavior {
    @Override
    public void performWalk() {
        System.out.println("I just walk");
    }
}
