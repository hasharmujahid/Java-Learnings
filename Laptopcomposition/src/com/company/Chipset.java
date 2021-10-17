package com.company;

public class Chipset {
    private String Model;
    private String Generation;
    private double  Basefrequency;

    public String getModel() {
        return Model;
    }

    public String getGeneration() {
        return Generation;
    }

    public double getBasefrequency() {
        return Basefrequency;
    }

    public Chipset(String model, String generation, double basefrequency) {
        Model = model;
        Generation = generation;
        Basefrequency=basefrequency;
    }
    public void checkbasefrequency(){
        if(Basefrequency>=1.0){
            System.out.println("This chipset  qualifies for windows 11 instalation ");
        }
        else System.out.println("CPU is weak For installation");
    }
}
