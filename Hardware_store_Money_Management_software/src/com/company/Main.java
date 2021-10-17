package com.company;

public class Main {

    public static void main(String[] args) {
Products products=new Products();
products.add_products_in_store();
        Stock stock=new Stock();
        stock.set_price();
        stock.print();

    }
}
