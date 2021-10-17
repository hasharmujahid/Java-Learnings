package com.company;

public class Dog extends Animal{
    int Tail;

    public Dog(int eyes, int brain, int heart, int legs, int tail) {
        super(eyes, brain, heart, legs);
        Tail = tail;
    }

    public int getTail() {
        return Tail;
    }
    public void running(){
        moving();
    }
    public void bark(){
        speaking();
        System.out.println("Dog is barking");
    }
}
