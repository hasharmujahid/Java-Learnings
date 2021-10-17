package com.company;

public class Stocklist {
    public int Stock;
    public String Product_name;
    public int Product_price;

    public int getStock() {
        return Stock;
    }

    public String getProduct_name() {
        return Product_name;
    }

    public int getProduct_price() {
        return Product_price;
    }

    public Stocklist(String product_name,int stock, int product_price) {
        Stock = stock;
        Product_name=product_name;
        Product_price=product_price;
    }
}
