package com.company;


public class Money extends Conversion {
    private double amount;
    private String currencyFrom;
    private String currencyTo;
    double convert1;
    double convert2;

    public Money(double amount, String currencyFrom, String currencyTo) {
        this.amount = amount;
        this.currencyFrom = currencyFrom;
        this.currencyTo = currencyTo;
    }

    public double getAmount() {
        return amount;
    }

    public String getCurrencyFrom() {
        return currencyFrom;
    }

    public String getCurrencyTo() {
        return currencyTo;
    }
    public double converter (){

        switch (getCurrencyFrom()) {
            case "USD":
                break;
            case "EUR":
                 convert1 = fromEUR(getAmount());
                break;
            case "JPY":
                convert1 = fromJPY(getAmount());
                break;
            case "BTC":
                convert1 = fromBTC(getAmount());
            default:
                System.out.println("Invalid Input");
                break;
        }
                    switch(getCurrencyTo()){
                        case "USD":
                            convert2= toUSD(getAmount());
                            break;
                        case "EUR":
                            convert2 = toEUR(getAmount());
                            break;
                        case "JPY":
                            convert2 = toJPY(getAmount());
                        case "BTC":
                            convert2 = toBTC(getAmount());
                    }

        return convert2;
    }
    public void showResults (){
        System.out.println("Converting " + getAmount() + " from " + getCurrencyFrom() + " to " + getCurrencyTo() + " is " + convert2);
    }
}

