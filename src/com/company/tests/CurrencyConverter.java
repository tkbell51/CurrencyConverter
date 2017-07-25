package com.company.tests;

import com.company.Money;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by TKB on 7/25/17.
 */
public class CurrencyConverter {
    @Test
    public void ConverterTest() {
        Money money = new Money(30, "USD", "USD");
        money.toUSD(money.getAmount());
        assertEquals(30, money.getResult(), .01);
    }
    @Test
    public void ConverterTestEUR(){
        Money money = new Money(34, "USD", "EUR");
        money.toEUR(money.getAmount());
        assertEquals(29.2, money.getResult(),.01);
    }
    @Test
    public void ConverterTestJPY(){
        Money money = new Money(23.50, "USD", "JPY");
        money.toJPY(money.getAmount());
        assertEquals(2629.25, money.getResult(), .01);
    }
    @Test
    public void ConverterTestBTC(){
        Money money = new Money(15, "USD", "BTC");
        money.toBTC(money.getAmount());
        assertEquals(0.00585364, money.getResult(), .01);
    }
    @Test
    public void ConverterfromEUR(){
        Money money = new Money(30, "EUR", "USD");
        money.fromEUR(money.getAmount());
        assertEquals(34.9451, money.getResult(), .01);
    }
    @Test
    public void ConverterfromJPY(){
        Money money = new Money(25, "JPY", "USD");
        money.fromJPY(money.getAmount());
        assertEquals(0.223451, money.getResult(), .01);
    }
    @Test
    public void ConverterfromBTC(){
        Money money = new Money(1, "BTC", "USD");
        money.fromBTC((money.getAmount()));
        assertEquals(2559.29, money.getResult(), .01);
    }

}
