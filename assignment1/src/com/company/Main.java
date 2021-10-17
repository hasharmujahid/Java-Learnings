package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Addition();
        Subtraction();
        Division();
        Multiplication();

    }
    public static int inputInt(String val){
        System.out.print(val);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public static void Addition(){
        int A = inputInt("Enter A: ");

        int B = inputInt("Enter B: ");
        int C=A+B;
        System.out.println("Addition Operator is Used ahead");
        System.out.println("Addition of A+B in C gives us the final value of "+C);

    }
    public static void Multiplication(){
        Scanner std1 = new Scanner(System.in);
        System.out.print("Enter value of A ");
        int A = std1.nextInt();
        Scanner std2;
        std2 = new Scanner(System.in);
        System.out.print("Enter the value of B");
        int B = std2.nextInt();
        int C;
        System.out.println("Multiplication Operator is Used ahead");
        C=A*B;
        System.out.println("multiplication of A*B dives us the final value of c is "+C);

    }
    public static void Subtraction(){
        Scanner std1 = new Scanner(System.in);
        System.out.print("Enter value of A ");
        int A = std1.nextInt();

        Scanner std2;
        std2 = new Scanner(System.in);
        System.out.print("Enter the value of B");
        int B = std2.nextInt();
        int C=A-B;
        System.out.println("Subtraction Operator is Used ahead");
        System.out.println("Subtraction of A-B = C gives us the final value of C = "+C);

    }
    public static void Division(){
        Scanner std1 = new Scanner(System.in);
        System.out.print("Enter value of A = ");
        int A = std1.nextInt();

        Scanner std2;
        std2 = new Scanner(System.in);
        System.out.print("Enter the value of B = ");
        int B = std2.nextInt();
        int C=A/B;
        System.out.println("Division Operator is Used ahead ");
        System.out.println("Division of A/B in C gives us the final value of ="+C);
    }
}
