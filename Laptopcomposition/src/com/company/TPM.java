package com.company;

public class TPM {
    private double tpmversion;

    public double getTpmversion() {
        return tpmversion;
    }

    public TPM(double tpmversion) {
        this.tpmversion = tpmversion;
    }
    public void CheckTpmVersion(){
        if (tpmversion>=2.0){
            System.out.println("This Tpm version qualifies for windows 11 instalation ");
        }
        else System.out.println("tpm version in outdated ");

    }
}
