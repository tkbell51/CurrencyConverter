package com.company.tests;

import com.company.Money;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by TKB on 7/25/17.
 */
public class CurrencyConverter {
    @Test
    public void CurrencyConverterTest() {
        Money money = new Money(30, "USD");
        money.toUSD(money.getAmount());
        assertEquals(30, money.getResult(), .001);
    }
    @Test
    public void CurrencyConverterTestEUR(){
        Money money = new Money(40, "USD");
        money.toEUR(money.getAmount());
        assertEquals(1, money.getResult(),.001);
    }


}
