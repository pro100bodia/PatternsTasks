package com.epam;

public class RejectedState extends State {
    public RejectedState(Order order) {
        super(order);
    }

    public void changeState(){
        System.out.println("You are rejected");
    }
}
