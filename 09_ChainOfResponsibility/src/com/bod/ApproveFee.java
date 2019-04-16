package com.bod;

public class ApproveFee extends Fee {
    public ApproveFee(int sum) {
        super(sum);
    }

    @Override
    public void processFee() {
        System.out.println(sum);
        System.out.println("Thank you, your fee is approved");
    }
}
