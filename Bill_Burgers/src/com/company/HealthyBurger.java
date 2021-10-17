package com.company;

public class HealthyBurger extends Hamburger{

    public HealthyBurger(String bread_roll_type, String meat) {
        super(bread_roll_type, meat);
    }
    public void addspecial_sauce(){
        System.out.println("special souce is added");
        this.Price+=3;
        System.out.println(getPrice());
    }
    public void addcheese(){
        System.out.println("cheese is added");
        this.Price+=3;
        System.out.println(getPrice());
    }
}
