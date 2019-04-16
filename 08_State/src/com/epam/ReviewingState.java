package com.epam;

import java.util.Random;

public class ReviewingState extends State {
    public ReviewingState(Order order) {
        super(order);
    }

    public void changeState() {
        System.out.println("reviewing");

        Random rand = new Random();
        int randomNum = rand.nextInt(1) + 0;

        State next = (randomNum == 1) ? new ApprovedState(order) : new RejectedState(order);
        order.changeState(next);
    }
}
