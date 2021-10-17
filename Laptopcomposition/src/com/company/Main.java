package com.company;

public class Main {

    public static void main(String[] args) {
	GraphicsCard graphicsCard=new GraphicsCard("615","intel");
    BIOS bios=new BIOS("1.0.2.33",new Bootloader("c"));
    bios.getBootloader().findingbootdisk();
    TPM tpm=new TPM(2.0);
    tpm.CheckTpmVersion();
    Chipset chipset=new Chipset("intel core m3","7th",1.0);
    chipset.checkbasefrequency();
    Motherboard motherboard=new Motherboard(chipset,tpm,bios,graphicsCard);
    Laptop laptop=new Laptop(motherboard,new HardDisk("ADATA",500),new Keyboard("RAZER","mechanical"),new Display(2450,1440,"Samsung"),new SSD("Samsung",128));
    laptop.getMotherboard().getBios().getBootloader().findingbootdisk();
    }
}
