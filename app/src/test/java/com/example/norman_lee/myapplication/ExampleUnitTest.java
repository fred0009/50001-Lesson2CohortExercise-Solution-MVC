package com.example.norman_lee.myapplication;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.norman_lee.myapplication.model.ExchangeRate;
import com.example.norman_lee.myapplication.model.ExchangeRateService;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    //TODO 5.4 Write unit tests to check calculateExchangeRate
    @Test
    public void default_exchange_rate() {
        ExchangeRateService exchangeRate = new ExchangeRate();
        assertEquals(2.95, exchangeRate.getExchangeRate(), 0e-7);
    }

    @Test
    public void user_input_exchange_rate() {
        ExchangeRateService exchangeRate = new ExchangeRate();
        exchangeRate.setExchangeRate("3", "1");
        assertEquals(0.33, exchangeRate.getExchangeRate(), 0e-7);
    }

    @Test(expected = NumberFormatException.class)
    public void number_non_number_input() {
        ExchangeRateService exchangeRate = new ExchangeRate();
        exchangeRate.setExchangeRate("a", "b");
    }

    @Test(expected = ArithmeticException.class)
    public void division_by_zero() {
        ExchangeRateService exchangeRate = new ExchangeRate();
        exchangeRate.setExchangeRate("0", "2");
    }

}