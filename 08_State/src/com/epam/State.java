package com.epam;

public abstract class State {
    Order order;

    public State(Order order) {
        this.order = order;
    }

    abstract void changeState();
}
