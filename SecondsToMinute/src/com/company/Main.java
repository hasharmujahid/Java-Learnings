package com.company;

public class Main {

    public static void main(String[] args) {
	getDurationString(500,59);

    }
    public static double getDurationString(int minutes, int seconds){
        if((seconds >= 0) && (seconds <= 59) && (minutes>=0)){
                System.out.println("valid values");
                double hours=minutes
            System.out.println("hours are "+hours);
                return hours;

            }
        return -1;
    }
}
