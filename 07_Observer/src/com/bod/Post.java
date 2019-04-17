package com.bod;

public class Post {
    private Magazine magazine;
    private Publisher publisher;

    public Post(Magazine magazine, Publisher publisher) {
        this.magazine = magazine;
        this.publisher = publisher;
    }

    public void mail(){
        publisher.notifySubscribers(magazine);
    }

    public Magazine getMagazine() {
        return magazine;
    }

    public void setMagazine(Magazine magazine) {
        this.magazine = magazine;
    }
}
