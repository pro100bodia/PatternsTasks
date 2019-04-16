package com.bod;

public class Bakteria {
    private int x, y;
    private BakteriaType type;

    public Bakteria(int x, int y, BakteriaType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void  draw(){
        System.out.println(x + ", " + y);
        type.draw();
    }
}
