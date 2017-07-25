package com.company;

/**
 * Created by TKB on 7/25/17.
 */
public class Conversion {
    private double USD;
    private double JPY;
    private double EUR;
    private double BTC;
    private double result;



    public Conversion() {
        this.USD = 1;
        this.JPY = 111.814;
        this.EUR = 0.85;
        this.BTC = 0.000392804;
        this.result = result;
    };

    public double getResult() {
        return result;
    }

    public double getUSD() {
        return USD;
    }

    public double getJPY() {
        return JPY;
    }

    public double getEUR() {
        return EUR;
    }

    public double getBTC() {
        return BTC;
    }

    public double toUSD(double amount){
        System.out.println(amount);
        return result = amount;
    }

    public double toJPY(double amount){
//
        return result = amount * JPY;
    }

    public double toEUR(double amount){

        return result = amount / EUR;
    }

    public double toBTC(double amount){

        return result = amount / BTC;
    }

    public void showResult (){
        System.out.println(getResult());
    }
}
