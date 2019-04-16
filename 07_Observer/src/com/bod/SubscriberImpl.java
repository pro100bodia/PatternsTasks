package com.bod;

public class SubscriberImpl implements Subscriber {
    private Magazine magazine;

    @Override
    public void update(Magazine magazine) {
        this.magazine = magazine;
    }

    @Override
    public Magazine getMagazine() {
        return magazine;
    }
}
