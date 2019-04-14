package com.epam;

public class CreatedState extends State {
    public CreatedState(Order order) {
        super(order);
    }

    public void changeState() {
        System.out.println("created");
        order.changeState(new ReviewingState(order));
    }
}
