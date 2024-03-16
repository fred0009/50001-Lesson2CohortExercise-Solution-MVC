package com.example.norman_lee.myapplication.model;

public interface ExchangeRateService {
    void setExchangeRate(String home, String foreign);
    double getExchangeRate();
}
