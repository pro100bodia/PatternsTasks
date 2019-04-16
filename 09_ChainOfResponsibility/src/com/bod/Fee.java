package com.bod;

public abstract class Fee implements Stage {
    int sum;
    Fee next;

    public Fee(int sum){
        this.sum = sum;
        next = null;
    }

    @Override
    public void processFee() {
        next.processFee();
    }

    @Override
    public void setNext(Fee fee) {
        this.next = fee;
    }

    @Override
    public int getFee() {
        return this.sum;
    }

    @Override
    public void setSum(int sum) {
        this.sum = sum;
    }
}
