package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public  class Product {

     Map<Integer,Stocklist> product_name_And_Info=new HashMap<>();
     Scanner scanner=new Scanner(System.in);
     //ADD PRODUCT
     public void add_Product(int product_Id,String product_name, int Stock,int price) {
          product_name_And_Info.put(product_Id,new Stocklist(product_name,Stock,price));

     }

     public void print(){
          Set<Integer>val=product_name_And_Info.keySet();
          for (Integer keys:val){
               System.out.println(product_name_And_Info.get(keys)+" : "+product_name_And_Info.get(keys).Product_name+":"+product_name_And_Info.get(keys).Product_price);
          }
     }


}
