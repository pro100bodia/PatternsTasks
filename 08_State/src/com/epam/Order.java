package com.epam;

public class Order {
    private State state;

    public Order() {
        this.state = new CreatedState(this);
    }

    public void changeState(State state){

        this.state = state;
        state.changeState();
    }


}
