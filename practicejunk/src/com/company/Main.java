package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        char A=inputcharacter();
        if(Character.isAlphabetic(A)){
            System.out.println(A+" i s a alphabet");

        }else System.out.println(A+" is not a alphabet");
    }
    public static char inputcharacter(){
        Scanner scanner=new Scanner(System.in);
        return scanner.next().charAt(0);
    }
}
