package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Vending_Machine {
     static Products products=new Products();
     static Display_menu display_menu=new Display_menu();
     static Select_Product select_product=new Select_Product();
    static   int Entered_Amount;

    //Constructor-------------------------
    public Vending_Machine(int entered_Amount) {
        Entered_Amount = entered_Amount;
    }

    //BILL CALCULATION---------------------------------------



    //PRODUCT SELECTION---------------------------------------------------------
    static class Select_Product{
        ArrayList<String>productsSelection= products.Products_to_be_added;
        int selected_product;
        public int Selection_process(){
            Scanner scanner=new Scanner(System.in);
            System.out.println("enter the number");
            int seclect=scanner.nextInt();
            if (seclect-1<=productsSelection.size()){
                System.out.println(productsSelection.get(seclect-1)+" is selescted");
                this.selected_product=seclect;
            }
            return seclect;

        }

        public void calculation(){
            int SelectedProduct=selected_product;
            switch (SelectedProduct){
                case 1:{
                    if (Entered_Amount>=15) {
                        Entered_Amount -= 15;
                        System.out.println("chili is 15 RS remainning amount is " + Entered_Amount);
                    }else {
                        System.out.println("money is not enough");
                    }
                }break;
                case 2: {
                    if (Entered_Amount >= 10) {
                        Entered_Amount -= 10;
                        System.out.println("Banana is 10RS remainning amount is " + Entered_Amount);
                    }else {
                        System.out.println("money is not enough");
                    }
                }break;
                case 3:{
                    if (Entered_Amount>=13) {
                        Entered_Amount -= 13;
                        System.out.println("Apple is 13RS remainning amount is " + Entered_Amount);
                    }else {
                        System.out.println("money is not enough");
                    }
                }break;
                case 4:{
                    if (Entered_Amount>=30) {
                        Entered_Amount -= 30;
                        System.out.println("Lays is 30RS remainning amount is " + Entered_Amount);
                    }else {
                        System.out.println("money is not enough");
                    }
                }break;
                case 5:{
                    if (Entered_Amount>=50) {
                        Entered_Amount -= 50;
                        System.out.println("kurkaray is 50RS remainning amount is " + Entered_Amount);
                    }else {
                        System.out.println("money is not enough");
                    }
                }break;
                case 6:{
                    if (Entered_Amount>=45) {
                        Entered_Amount -= 45;
                        System.out.println("cream is 45RS remainning amount is " + Entered_Amount);
                    }else {
                        System.out.println("money is not enough");
                    }
                }break;
                case 7:{
                    if (Entered_Amount>=30) {
                        Entered_Amount -= 30;
                        System.out.println("Choclate is 30RS remainning amount is " + Entered_Amount);
                    }else {
                        System.out.println("money is not enough");
                    }
                }break;
                case 8:{
                    if (Entered_Amount>=50) {
                        Entered_Amount -= 50;
                        System.out.println("wavy is 50RS remainning amount is " + Entered_Amount);
                    }else {
                        System.out.println("money is not enough");
                    }
                }break;
                case 9:{
                    if (Entered_Amount>=100) {
                        Entered_Amount -= 100;
                        System.out.println("Ice cream is 100 RS remainning amount is " + Entered_Amount);
                    }else {
                        System.out.println("money is not enough");
                    }
                }break;
                case 10:{
                    if (Entered_Amount>=5) {
                        Entered_Amount -= 5;
                        System.out.println("Batanay is 5 RS remainning amount is " + Entered_Amount);
                    }else {
                        System.out.println("money is not enough");
                    }
                }break;

            }
        }
}
     //DISPLAY CLASSS_____________________________________________________________
     static class Display_menu {
       boolean bool=true;

       public void display(boolean bool){

       if (bool==true) {
           System.out.println("---------MENU---------");
           for (int i = 0; i <= products.Products_to_be_added.size()-1; i++) {
               System.out.println(i+1 + " to purchsse this item " + products.Products_to_be_added.get(i));
           }
       }
       }
    }


    //PRODUCT CLASSS_________________________________________________________
    static class Products {
            int productLimit=9;
          ArrayList<String> Products_to_be_added =new ArrayList<>();


        public boolean add_products (String  product_to_be_entered ){
        if (this.Products_to_be_added.contains(product_to_be_entered)) {
            System.out.println(product_to_be_entered + " is already present Or the machine is full run diaganostics ");
            return false;
        } else {
            if (this.Products_to_be_added.size()<=productLimit) {

                this.Products_to_be_added.add(product_to_be_entered);
                System.out.println(product_to_be_entered + " enterd Sucessfully");
            }
            return true;
        }

    }
        public boolean Remove_product () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the product ----> ");
        String product_to_be_removed = scanner.nextLine();
        if (this.Products_to_be_added.contains(product_to_be_removed)) {
            System.out.println("removing hte product");
            this.Products_to_be_added.remove(product_to_be_removed);
            return true;
        } else {
            System.out.println(product_to_be_removed + " is not present in the machine");
            return false;
        }

    }
    }




}
