package com.example.norman_lee.myapplication;

import java.math.BigDecimal;

public class ExchangeRate {

    public static double calculateExchangeRate(){
        return 2.95;
    }

    //TODO 3.9 Calculate the exchange rate
    public static double calculateExchangeRate(String A, String B)
            throws NumberFormatException, ArithmeticException {
        if (A.equals("") || B.equals("") ) throw new NumberFormatException();

        double valA = Double.parseDouble(A);
        double valB = Double.parseDouble(B);

        if ( Math.abs(valA) < 1e-9 ) throw new ArithmeticException();

        return valB / valA;
    }


}
