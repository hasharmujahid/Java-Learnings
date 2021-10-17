package com.company;

import java.util.Scanner;

public class Home_Currency {
    private int amount;
    private String currency_name="PKR";


    public int getAmount() {

        return amount;
    }

    public String getCurrency_name() {
        return currency_name;
    }

    public Home_Currency(int amount, String currency_name) {
        this.amount = amount;
        this.currency_name = currency_name;
    }



}
