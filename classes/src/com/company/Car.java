package com.company;

public class Car {
    private int doors;
    private int wheels;
    private String colour;
    private String model;

    public void  setDoors(int doors){
        int doorsnumber=doors;
        if (doorsnumber>6 && doorsnumber<10) {
            this.doors = doors;
        }
        else {
            this.doors=-1;
        }

    }
    public int getDoors(){
        return this.doors ;
    }

}
