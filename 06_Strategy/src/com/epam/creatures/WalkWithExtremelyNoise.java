package com.epam.creatures;

public class WalkWithExtremelyNoise implements WalkBehavior {
    @Override
    public void performWalk() {
        System.out.println("I walk with extremely noise");
    }
}
