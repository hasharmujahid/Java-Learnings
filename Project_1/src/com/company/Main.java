package com.company;

public class Main {

    public static void main(String[] args) {
	Product product=new Product();
    product.add_Product(1,"screw",400,2);
        product.add_Product(2,"screw ranch",100,200);
        product.add_Product(3,"screw driver",80,240);
    product.print();
    }
}
