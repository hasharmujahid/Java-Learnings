package com.company;

import java.util.Scanner;

public class Dollar extends Home_Currency {
    public double dollar_price;
    public double amount_after_conversion;

    public double getDollar_price() {
        return dollar_price;
    }

    public void setDollar_price(int dollar_price) {
        this.dollar_price = dollar_price;
    }

    public double getAmount_after_conversion() {
        return amount_after_conversion;
    }

    public void setAmount_after_conversion(double amount_after_conversion) {
        this.amount_after_conversion = amount_after_conversion;
    }

    public Dollar(int amount, String currency_name, double dollar_price) {
        super(amount, currency_name);
        this.dollar_price = dollar_price;
    }
    public double conversion(){
        double converted =  this.getAmount() / this.dollar_price;
        this.amount_after_conversion+=converted;
        System.out.println("Amonut After Converted to Dollar from PKR"+converted);
        return this.amount_after_conversion;

    }

}
