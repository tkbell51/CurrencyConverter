package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("CURRENCY CONVERTER");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        DecimalFormat df = new DecimalFormat("###.##");
        double amount = scanner.nextDouble();
        System.out.println("Select Currency from USD, EUR, JPY, OR BTC: ");
        String currencyFrom = scanner.next();
        System.out.println("Select Currency to USD, EUR, JPY, OR BTC: ");
        String currencyTo = scanner.next();
        System.out.println("Convert " + df.format(amount) + " from " + currencyFrom + " to " + currencyTo);

        Money money = new Money(amount,currencyFrom,currencyTo);
        money.converter();
        money.showResults();


    }
}
