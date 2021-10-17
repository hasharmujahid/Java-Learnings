package com.company;

public class Hamburger {
    public String bread_roll_type;
    public String meat;
    public int Price;


    public String getBread_roll_type() {
        return bread_roll_type;
    }

    public String getMeat() {
        return meat;
    }

    public int getPrice() {
        System.out.println("your total price is ");
        return Price;
    }

    public Hamburger(String bread_roll_type, String meat) {
        this.bread_roll_type = bread_roll_type;
        this.meat = meat;
        Price = 8;
    }

    public void addlettuce(){
        System.out.println("letuce is added");
        this.Price+=2;
        System.out.println(getPrice());
    }
    public void addTotamto(){
        System.out.println("tomatos have been aded");
        this.Price+=2;
        System.out.println(getPrice());
    }
    public void addcarrots(){
        System.out.println("carrots ahave been adaed");
        this.Price+=2;
        System.out.println(getPrice());

    }
    public void mayo(){
        System.out.println("mayo is added");
        this.Price+=2;
        System.out.println(getPrice());
    }
}
