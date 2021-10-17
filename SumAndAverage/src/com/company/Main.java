package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int sum=0;
        double average=0;
        for(int i=1;i<=5;i++){
            int number=input();
            sum+=number;
            average=sum/number;


        }
        System.out.println("the average is "+average);
        System.out.println("the sum is "+sum);
    }
    public static int input(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number");
        return scanner.nextInt();
    }
}
