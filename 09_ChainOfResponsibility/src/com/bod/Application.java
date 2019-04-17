package com.bod;

import java.util.Scanner;

public class Application {
    private static void callMenu(String payer, int sum){
        GetFee getFee = new GetFee(sum);
        GetCommition getCommition = new GetCommition(sum, 5);
        GetTax getTax = new GetTax(sum, 6);
        ApproveFee approveFee = new ApproveFee(sum);

        switch (getPayer(payer))
        {
            case SIMPLE:
                getFee.setNext(getCommition);
                getCommition.setNext(getTax);
                getTax.setNext(approveFee);

                getFee.processFee();

                break;
            case BENEFICIARY:
                getFee.setNext(getCommition);
                getCommition.setNext(approveFee);

                getFee.processFee();

                break;
            case PENSIONER:
                getFee.setNext(approveFee);
                getFee.processFee();

        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String payer = s.nextLine();
        int sum = s.nextInt();

        callMenu(payer, sum);
    }

    private static PayerTypeEnum getPayer(String payer){
        try {
            return PayerTypeEnum.valueOf(payer.toUpperCase());
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return null;
        }
    }
}
