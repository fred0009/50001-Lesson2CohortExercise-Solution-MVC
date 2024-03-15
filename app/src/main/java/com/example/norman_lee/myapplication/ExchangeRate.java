package com.example.norman_lee.myapplication;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ExchangeRate {

    public static double calculateExchangeRate(){
        return 2.95;
    }

    //TODO 3.9 Calculate the exchange rate
    public static double calculateExchangeRate(String A, String B)
            throws NumberFormatException, ArithmeticException {
        if (A.equals("") || B.equals("") ) throw new NumberFormatException();

        BigDecimal valA = new BigDecimal(A);
        BigDecimal valB = new BigDecimal(B);

        if ( valA.equals( new BigDecimal("0.0") ) ) throw new ArithmeticException();

        return valB.divide(valA, 2, RoundingMode.HALF_UP).doubleValue();
    }


}
