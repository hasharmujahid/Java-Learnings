package com.company;

public class Car extends Main {
    private String Transmision;
    private String Engine;
    private int Wheel;
    private int Gear;
    private int Doors;

    public Car(String transmision, String engine, int wheel, int gear, int doors) {
        Transmision = transmision;
        Engine = engine;
        Wheel = wheel;
        Gear = gear;
        Doors = doors;
    }

    public String getTransmision() {
        return Transmision;
    }

    public String getEngine() {
        return Engine;
    }

    public int getWheel() {
        return Wheel;
    }

    public int getGear() {
        return Gear;
    }

    public int getDoors() {
        return Doors;
    }
    public void use(){

    }
}
