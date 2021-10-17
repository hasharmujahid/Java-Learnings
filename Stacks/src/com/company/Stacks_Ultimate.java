package com.company;

import java.util.Scanner;
import java.util.Stack;

public class Stacks_Ultimate {
    private Stack<Integer> num=new Stack<Integer>();
    private Scanner scan=new Scanner(System.in);

    //pushing elements
    public void push(){
        System.out.println("enter the size of stack");
        int size=scan.nextInt();
        for (int i=0; i<size;i++){
            System.out.println("enter the number you want tot add");
            int numadd=scan.nextInt();
            num.push(numadd);
            System.out.println(num);
        }
    }
    public void get(){
        System.out.println("enter the index");
        int index=scan.nextInt();
        if (num.size()>index){
            System.out.println(num.get(index));
            num.add(index,34);
            System.out.println(num);
        }
    }
}
