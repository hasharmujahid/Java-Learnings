package com.company;

public class HardDisk {
    private String Model;
    private int Capacity;

    public String getModel() {
        return Model;
    }

    public int getCapacity() {
        return Capacity;
    }

    public HardDisk(String model, int capacity) {
        Model = model;
        Capacity = capacity;
    }
}
