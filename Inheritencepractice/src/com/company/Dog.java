package com.company;

public class Dog extends Animal{
    private int eyes;
    private int legs;
    private int teeth;
    private int tail;

    public Dog(int eyes, int legs,int teeth,int tail, int size, String name, int weight) {
        super(1, 1, size, name, weight);
        this.eyes=eyes;
        this.tail=tail;
        this.legs=legs;
        this.teeth=teeth;
    }

}
