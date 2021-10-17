package com.company;

public class Animal {
    public int eyes;
    public int brain;
    public int heart;
    public int legs;

    public int getEyes() {
        return eyes;
    }

    public int getBrain() {
        return brain;
    }

    public int getHeart() {
        return heart;
    }

    public Animal(int eyes, int brain, int heart,int legs) {
        this.eyes = eyes;
        this.brain = brain;
        this.heart = heart;
        this.legs=legs;
    }
    public void moving(){
        String movement;
        movement=String.valueOf(legs);
        System.out.println("Animal is moving on "+movement+" legs");
    }
    public void speaking(){
        System.out.println("Animal is speaking");
    }
}
