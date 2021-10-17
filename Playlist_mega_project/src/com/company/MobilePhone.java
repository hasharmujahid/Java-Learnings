package com.company;

public class MobilePhone implements iMobilePhone{
   boolean power_status=false;
   Music music;

    public MobilePhone(boolean power_status) {
        this.power_status = power_status;
    }

    public boolean isPower_status() {
        return power_status;
    }

    public void setPower_status(boolean power_status) {
        this.power_status = power_status;
    }

    @Override
    public void check_power_on() {
        if (power_status==true){
            System.out.println("phone is powered on ");
        }
        else {
            System.out.println("phone is powered off set the power status to 'true'");
        }
    }


    @Override
    public void open_menu() {
        if (power_status==true){
            System.out.println("opening menu...");
            System.out.println("1: Music");
            System.out.println("2: Dial Number");
        }
        else {
            System.out.println("phone is powered off set the power status to 'true'");
        }

    }
}
