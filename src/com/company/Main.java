package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        System.out.println("CURRENCY CONVERTER");
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the amount");
//        double amount = scanner.nextDouble();
//        System.out.println("Select Currency from USD, EUR, JPY, OR BTC: ");
//        String currencyFrom = scanner.next();
//        System.out.println("Select Currency to USD, EUR, JPY, OR BTC: ");
//        String currencyTo = scanner.next();
//        System.out.println("Convert " + amount + " from " + currencyFrom + " to " + currencyTo);

        Money money = new Money(50,"USD");
        money.toBTC(money.getAmount());


    }
}
