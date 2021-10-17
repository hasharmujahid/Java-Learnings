package com.company;

public class BIOS {
    private String Biosversion;
    private Bootloader bootloader;

    public String getBiosversion() {
        return Biosversion;
    }

    public Bootloader getBootloader() {
        return bootloader;
    }

    public BIOS(String biosversion, Bootloader bootloader) {
        Biosversion = biosversion;
        this.bootloader = bootloader;
    }

    public void load(){
        System.out.println("loading.... ");
    }

    public void loadbios(){
        load();
        System.out.println("Bios is loading .... ");

    }
}
