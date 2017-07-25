package com.company;

/**
 * Created by TKB on 7/25/17.
 */
public class Conversion {
    private double USD;
    private double JPY;
    private double EUR;
    private double BTC;
    private double oneEUR;
    private double oneJPY;
    private double oneBTC;


    public Conversion() {

        this.JPY = 111.873;
        this.EUR = 0.858635;
        this.BTC = 0.000392804;
        this.oneBTC = 2559.29;
        this.oneEUR = 1.16483;
        this.oneJPY = 0.00893637;
        this.result = result;
    };

    public double getOneEUR() {
        return oneEUR;
    }

    public double getOneJPY() {
        return oneJPY;
    }

    public double getOneBTC() {
        return oneBTC;
    }

    private double result;





    public double getResult() {
        return result;
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
        return result = amount;
    }


    public double fromJPY(double amount){
        return result = amount * oneJPY;
    }
    public double toJPY(double amount){
        return result = amount * JPY;
    }


    public double fromEUR(double amount){
        return result = amount * oneEUR;
    }
    public double toEUR(double amount){
        return result = amount * EUR;
    }

    public double fromBTC(double amount){
        return result = amount / BTC;
    }
    public double toBTC(double amount){
        return result = amount * BTC;
    }

    public void showResult (){
        System.out.println(getResult());
    }

}
