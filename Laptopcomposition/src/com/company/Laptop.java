package com.company;

public class Laptop {
    private Motherboard motherboard;
    private HardDisk hardDisk;
    private Keyboard keyboard;
    private Display display;
    private SSD ssd;

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Display getDisplay() {
        return display;
    }

    public SSD getSsd() {
        return ssd;
    }

    public Laptop(Motherboard motherboard, HardDisk hardDisk, Keyboard keyboard, Display display, SSD ssd) {
        this.motherboard = motherboard;
        this.hardDisk = hardDisk;
        this.keyboard = keyboard;
        this.display = display;
        this.ssd = ssd;
    }
}
