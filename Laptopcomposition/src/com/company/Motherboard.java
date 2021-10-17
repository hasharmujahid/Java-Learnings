package com.company;

public class Motherboard {
    private Chipset chipset;
    private TPM tpm;
    private BIOS bios;
    private GraphicsCard graphicsCard;

    public Chipset getChipset() {
        return chipset;
    }

    public TPM getTpm() {
        return tpm;
    }

    public BIOS getBios() {
        return bios;
    }

    public GraphicsCard getGraphicsCard() {
        return graphicsCard;
    }

    public Motherboard(Chipset chipset, TPM tpm, BIOS bios, GraphicsCard graphicsCard) {
        this.chipset = chipset;
        this.tpm = tpm;
        this.bios = bios;
        this.graphicsCard = graphicsCard;
    }
}
