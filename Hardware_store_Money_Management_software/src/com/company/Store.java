package com.company;

import java.util.*;

public class Store extends Products{
    HashMap<String,String>Product_Info=Product_In_store;

    ArrayList<String>Items_to_buy_list=new ArrayList<>();
    Scanner scanner=new Scanner(System.in);



    public void Dispaly_Products(){
        System.out.println("=================Menu=================");
        Set<Map.Entry<String,String>>values=Product_Info.entrySet();
        System.out.println("Product Id : Product name");
        for (Map.Entry<String,String> e: values){
            System.out.println(e.getKey()+"     :    "+e.getValue());
        }

    }
    public void Selected_products(){
        System.out.println("Enter the Product id or Product Name");
        String Id_Or_Name=scanner.nextLine();
        if (Product_Info.containsValue(Id_Or_Name)||Product_Info.containsKey(Id_Or_Name)){
            Items_to_buy_list.add(Product_Info.get(Id_Or_Name));
            System.out.println(Items_to_buy_list);
        }else {
            System.out.println("Item is not present in the store");
        }
    }

}
