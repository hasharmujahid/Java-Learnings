package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int count=1;
    int sum=0;
    while (count<=10){
        int number=inputmethood();
        sum=sum+number;
        count++;
    }
    System.out.println("sum of the values enter are "+sum);
    }
    public static int inputmethood(){
        int input=0;
        Scanner scanner=new Scanner(System.in);

        System.out.println("enter number");
        return scanner.nextInt();

    }
}
