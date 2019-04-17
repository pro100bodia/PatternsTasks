package com.epam.creatures;

public abstract class Creature {
    String identification;
    WalkBehavior walkBehavior;
    FlyBehavior flyBehavior;

    public Creature(){
        this.walkBehavior = new Walk();
        this.flyBehavior = new FlyNoWay();
    }

    public void setWalkBehavior(WalkBehavior walkBehavior) {
        this.walkBehavior = walkBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void identify(){
        System.out.println(this.identification);
    }

    public WalkBehavior getWalkBehavior() {
        return walkBehavior;
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }
}
