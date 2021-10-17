package com.company;

import java.util.HashMap;

public class Stock extends Products{
    HashMap<String, Integer> Product_with_Stock=new HashMap<>();

    public void set_price(){
        Product_with_Stock.put(Product_In_store.get("01"),50);
        Product_with_Stock.put(Product_In_store.get("02"),100);
        Product_with_Stock.put(Product_In_store.get("03"),80);
        Product_with_Stock.put(Product_In_store.get("04"),90);
        Product_with_Stock.put(Product_In_store.get("05"),55);
        Product_with_Stock.put(Product_In_store.get("06"),20);
        Product_with_Stock.put(Product_In_store.get("07"),400);
        Product_with_Stock.put(Product_In_store.get("08"),70);
        Product_with_Stock.put(Product_In_store.get("09"),30);
        Product_with_Stock.put(Product_In_store.get("10"),10);

    }
    public void print(){
        System.out.println(Product_with_Stock);
    }
}
