package com.company;

public class Bootloader {
    private String bootdisk;

    public void setBootdisk(String bootdisk) {
        this.bootdisk = bootdisk;
    }

    public Bootloader(String bootdisk) {
        this.bootdisk = bootdisk;
    }

    public boolean findingbootdisk(){
        if (bootdisk!=""){
            System.out.println(" Boot drivw detected");
            return true;
        }
        else System.out.println("boot drive didnt detected pls install an os");
            return false;
    }
}
