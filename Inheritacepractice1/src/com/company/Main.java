package com.company;

public class Main {

    public static void main(String[] args) {
	Car car=new Car("manual","1",4,5,4);
    Tesla tesla=new Tesla("automatic","4",4,5,"electric","batteries",300);
        System.out.println(car.getDoors());
    }
}
