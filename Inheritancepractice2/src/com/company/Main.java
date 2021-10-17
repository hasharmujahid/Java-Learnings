package com.company;

public class Main {

    public static void main(String[] args) {
        Animal animal=new Animal(2,1,1,4);
        System.out.println(animal.getHeart());
        animal.speaking();
        Dog dog=new Dog(2,1,1,4,1);
        dog.bark();
    }
}
