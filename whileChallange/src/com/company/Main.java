package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int number=userinput();
        int finishing_number=userinput();
        int count=0;
        while (number<=finishing_number){
            number++;
            if(!isEvenNumber(number)){

                continue;
            }
            else {
                System.out.println(count+" NUMBER IS EVEN " + number);

            }
            if (count>10){
                break;
            }else count++;
        }
    }
    public static boolean isEvenNumber(int value){
     if(value%2==0){
         return true;

     }else return false;

    }
    public static int userinput(){
        System.out.println("enter the number");
        Scanner scanner=new Scanner(System.in);
        return scanner.nextInt();

    }

}
