package com.company;

public class Main {

    public static void main(String[] args) {
	calcFeetAndInchesIntoCentimeter(3,3);
    calcFeetAndInchesIntoCentimeter(4);
    }
    public static long calcFeetAndInchesIntoCentimeter(double feet,double inches) {
        if (feet >= 0) {
            System.out.println("feets are positive and valid ");
              double centimeters=feet*30.48;
            System.out.println("feets are equal to "+centimeters +"cm");

        }
        if (inches >= 0 && inches <= 12) {
            System.out.println("inchees are also valid ");
            double centimeters=inches*2.54;
            System.out.println("inches are equal to "+centimeters +"cm");
            return (long) centimeters;
        }
        else return -1;
    }
    public static long calcFeetAndInchesIntoCentimeter(double inches){
        if (inches>=0){
            double feet=inches/12;
            System.out.println("total feets that are in the inches are "+ feet);
            return (long) feet;
        }
        else return -1;
    }
}
