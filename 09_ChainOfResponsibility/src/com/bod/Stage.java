package com.bod;

public interface Stage {
    void processFee();
    void setNext(Fee fee);
    int getFee();
    void setSum(int sum);
}
