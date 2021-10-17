package com.company;

public class GraphicsCard {
    private String Model;
    private String Manufacturer;

    public String getModel() {
        return Model;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public GraphicsCard(String model, String manufacturer) {
        Model = model;
        Manufacturer = manufacturer;
    }
}
