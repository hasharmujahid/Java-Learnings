package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class colourlist {
    Scanner scanner=new Scanner(System.in);
    private ArrayList<String>colour=new ArrayList<>();

    public void addcolour(){
        System.out.println("enter the colour you want to enter" );
        String colour=scanner.nextLine();
        this.colour.add(colour);
    }
    public void printlist(){
        System.out.println("array list is "+colour);
    }
}
