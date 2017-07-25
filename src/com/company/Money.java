package com.company;

/**
 * Created by TKB on 7/25/17.
 */
public class Money extends Conversion {
    private double amount;
    private String curSymbol;

    public Money(double amount, String curSymbol) {
        this.amount = amount;
        this.curSymbol = curSymbol;
    }

    public double getAmount() {
        return amount;
    }

    public String getCurSymbol() {
        return curSymbol;
    }


}

