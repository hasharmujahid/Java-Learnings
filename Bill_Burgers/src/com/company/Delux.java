package com.company;

public class Delux extends Hamburger{

    public Delux(String bread_roll_type, String meat) {
        super(bread_roll_type, meat);
    }
    public void addchips(){
        System.out.println("chips are added");
        this.Price+=3;
        System.out.println(getPrice());

    }
    public void adddrink() {
        System.out.println("drinks are added");
        this.Price += 3;
        System.out.println(getPrice());
    }

    @Override
    public void addlettuce() {
        System.out.println("cannot add");
    }

    @Override
    public void addTotamto() {
        System.out.println("cannot add");
    }

    @Override
    public void addcarrots() {
        System.out.println("cannot add");
    }
}
