package com.company;

public class Main {

    public static void main(String[] args) {
	Hamburger new1=new Hamburger("soft","beef");
    new1.addcarrots();
    new1.addlettuce();
        System.out.println(new1.getPrice());

    HealthyBurger new2=new HealthyBurger("soft","beef");
    new2.addspecial_sauce();
    new2.addlettuce();
    Delux delux=new Delux("soft","suasage");
    delux.addchips();
    delux.addcarrots();
    delux.adddrink();
    }

}
