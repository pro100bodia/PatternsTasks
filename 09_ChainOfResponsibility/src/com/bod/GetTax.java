package com.bod;

public class GetTax extends Fee {
    private int tax;
    public GetTax(int sum, int tax) {
        super(sum);
        this.tax = tax;
    }

    @Override
    public void processFee() {
        System.out.println("getting the tax");
        next.setSum(sum - tax);
        next.processFee();
    }
}
