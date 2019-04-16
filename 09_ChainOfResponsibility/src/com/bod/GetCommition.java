package com.bod;

public class GetCommition extends Fee {
    private int commition;

    public GetCommition(int sum, int comition) {
        super(sum);
        this.commition = comition;
    }

    @Override
    public void processFee() {
        System.out.println("getting the commition");
        next.setSum(sum - commition);
        next.processFee();
    }
}
