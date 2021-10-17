package com.company;

public class Keyboard {
    private String Model;
    private String formfactor;

    public String getModel() {
        return Model;
    }

    public String getFormfactor() {
        return formfactor;
    }

    public Keyboard(String model, String formfactor) {
        Model = model;
        this.formfactor = formfactor;
    }
}
