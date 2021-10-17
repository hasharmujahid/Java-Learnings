package com.company;

import java.util.*;

public class HashSets {
Set<String>set=new HashSet<>();
Scanner scanner=new Scanner(System.in);

    public boolean add_Elements(){

        System.out.println("Enter how many items you want to add ");
        int times=scanner.nextInt();
        scanner.nextLine();
        for (int i=1;i<=times;i++){
            System.out.println("enter the item you want to add at  "+i);
            String Element=scanner.nextLine();
            set.add(Element);

        }   return true;
    }
    public void print(){
        
        for (String Elements:set){
            System.out.println(Elements);
        }
    }
    public void get_Size(){
        System.out.println(set.size());
    }
    public void clear_Data(){
        set.clear();
    }
    public void convert_To_Array(){
        String[] arrays= new String[set.size()];
                set.toArray(arrays);
        System.out.println(arrays);
    }
    public void convert_To_TreeSet(){
        TreeSet<String>treeSet=new TreeSet<>(set);
        System.out.println(treeSet);
        System.out.println("success");
    }


}
