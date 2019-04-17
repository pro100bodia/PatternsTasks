package com.epam;

public class Application {
    public static void main(String[] args) {

        Order order = new Order();
        order.changeState(new CreatedState(order));
    }
}
