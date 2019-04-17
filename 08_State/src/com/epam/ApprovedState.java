package com.epam;

public class ApprovedState extends State {
    public ApprovedState(Order order) {
        super(order);
    }

    public void changeState(){
        System.out.println("Congratulations you are approwed");
    }
}
