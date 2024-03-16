package com.example.norman_lee.myapplication.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ExchangeRate implements ExchangeRateService {
    private double exchangeRate;
    private static final double DEFAULT_EXCHANGE_RATE = 2.95;

    public ExchangeRate() {
        this(DEFAULT_EXCHANGE_RATE);
    }

    public ExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    //TODO 3.9 Calculate the exchange rate
    @Override
    public void setExchangeRate(String A, String B)
            throws NumberFormatException, ArithmeticException {
        if (A.equals("") || B.equals("") ) throw new NumberFormatException();

        BigDecimal valA = new BigDecimal(A);
        BigDecimal valB = new BigDecimal(B);

        if ( valA.equals( new BigDecimal("0.0") ) ) throw new ArithmeticException();

        exchangeRate = valB.divide(valA, 2, RoundingMode.HALF_UP).doubleValue();
    }

    @Override
    public double getExchangeRate() {
        return exchangeRate;
    }

}
