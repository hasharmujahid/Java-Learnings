package com.company;

public class Main {

    public static void main(String[] args) {
	positiveornot(6);
    }
    public static int positiveornot(int userinput){
        if(userinput>0){
            System.out.println("positive");
        }
        if(userinput<0){
            System.out.println("negitive");
        }
        else if(userinput==0){
            System.out.println("zero");
        }

        return 2;
    }
}
