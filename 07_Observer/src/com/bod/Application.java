package com.bod;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Subscriber> subsList = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            subsList.add(new SubscriberImpl());
        }

        Publisher publisher = new Publisher(subsList);
        Magazine magazine = new Magazine("Sadovod");
        Post post = new Post(magazine, publisher);

        post.mail();

        for(Subscriber s: subsList)
        {
            System.out.println(s.getMagazine().getName());
        }
    }
}
