package com.example.norman_lee.myapplication;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.norman_lee.myapplication.model.ExchangeRate;

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
        assertEquals(2.95, ExchangeRate.calculateExchangeRate(), 0e-7);
    }

    @Test
    public void user_input_exchange_rate() {
        assertEquals(0.33, ExchangeRate.calculateExchangeRate("3", "1"), 0e-7);
    }

    @Test(expected = NumberFormatException.class)
    public void number_non_number_input() {
        ExchangeRate.calculateExchangeRate("a", "b");
    }

    @Test(expected = ArithmeticException.class)
    public void division_by_zero() {
        ExchangeRate.calculateExchangeRate("0", "2");
    }

}