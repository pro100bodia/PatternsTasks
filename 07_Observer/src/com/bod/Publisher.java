package com.bod;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
    private List<Subscriber> subscribers;

    public Publisher() {
        subscribers = new ArrayList<>();
    }

    public Publisher(List<Subscriber> subscribers) {
        this.subscribers = subscribers;
    }

    public void subscribe(Subscriber subscriber){
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber){
        subscribers.remove(subscriber);
    }

    public void notifySubscribers(Magazine magazine){
        for(Subscriber s: subscribers)
        {
            s.update(magazine);
        }
    }
}
