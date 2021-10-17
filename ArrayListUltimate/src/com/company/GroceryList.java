package com.company;

import java.util.*;

public class GroceryList {
    Scanner scanner=new Scanner(System.in);
    private ArrayList<String> grocerylist =new ArrayList<>();

    public void addItemInGroceyList(){
        System.out.print("enter the Item you want to add ---> ");
        String Item=scanner.nextLine().toLowerCase(Locale.ROOT);
        while (true) {
            if (Item.equals("EXIT".toLowerCase(Locale.ROOT))){
                break;
            }else {
                grocerylist.add(Item);
                System.out.print("enter the Item you want to add next ---> ");
                Item = scanner.nextLine().toLowerCase(Locale.ROOT);
            }
        }
        System.out.println("Added items in Grocery LIst are " + grocerylist);

    }
    public void removeItem(){
        System.out.print("Enter the item you want to remove ---> ");
        String Item=scanner.nextLine().toLowerCase(Locale.ROOT);
        if(grocerylist.contains(Item.toLowerCase(Locale.ROOT))){
            grocerylist.remove(Item);
        }
        else {
            System.out.println("Item is not present in the list ");
        }

        System.out.println("total remaining items in Grocery LIst are "+grocerylist);
    }

    public void Print_an_items(){
        for(int i=0;i<grocerylist.size();i++) {
            System.out.println("elements are "+grocerylist.get(i));
        }
    }
    //replace an item
    public void replace(){
        System.out.print("enter the position you want to modify: ");
        int index=scanner.nextInt();
        System.out.print("enter the item name; ");
        String Item=scanner.nextLine();
        grocerylist.set(index,Item);
        System.out.println("Item replaced new item is "+grocerylist.get(index));
        System.out.println("new grtvocery list is -->"+grocerylist);
    }
    public void iterator(){
        int i=0;
        while (i<grocerylist.size()){
            System.out.println("elemet at position "+i+" "+grocerylist.get(i));
            i++;
        }
    }
    public void retriever(){
        System.out.println("enter the indeof element you want to retrive");
        int index=scanner.nextInt();
        if (index<grocerylist.size()){
            System.out.println("target found ... getting the sequence");
            System.out.println("accsess authorized ...\n loading the data ... "+grocerylist.get(index));
        }else {
            System.out.println("target not found ");
            System.out.println("Aborting the mission");
        }


    }public void update(){
        System.out.println("enter the target elemnt ... ");
        String targetelemnt=scanner.nextLine();
        if(grocerylist.contains(targetelemnt)){
            System.out.println("target found ...");
            System.out.println("initiating sequence");
            System.out.println("enter the replacement ");
            String remedy=scanner.nextLine();
            System.out.println("target removed ....\n Adding double ");
            grocerylist.set((grocerylist.indexOf(targetelemnt)),remedy);
            System.out.println(grocerylist);

        }
        else {
            System.out.println("target not found ");
            System.out.println("aborting mission");
        }
    }
    public void remover3rd(){
        if (grocerylist.size()<3){
            System.out.println("size matter mate \n grow some balls");
        }
        else grocerylist.remove(3);
    }
    public void search(){
        System.out.print("entr the element you want to serch -----> ");
        String item=scanner.nextLine();
        if (grocerylist.contains(item)){
            System.out.println("element found ");
        }
        else {
            System.out.println("element not found");
        }
    }
    public void sort(){
        Collections.sort(grocerylist);
        System.out.println("sortred list "+grocerylist);
    }
    public void copylist(){
        ArrayList<String>list=new ArrayList<>();
        for (int i=0;i<grocerylist.size();i++){
            list.add(grocerylist.get(i));

        }System.out.println("copied list is "+list);
    }
    public void shuffle(){
        Collections.shuffle(grocerylist);
        System.out.println("shuffled arraylist"+grocerylist);
    }
    public void reverse(){
        Collections.reverse(grocerylist);
        System.out.println("reversed arraylist is "+grocerylist);
    }
    public void extractportion() {
        System.out.println("eneter the index you ant the elemnts from ");
        int index=scanner.nextInt();

            if (index<grocerylist.size()){
                for (int i=index; i<grocerylist.size();i++){

                    System.out.println("elements are "+grocerylist.get(i));
            }
        }else {
                System.out.println("invalid index");
            }
    }
    public void compare(){
        ArrayList<String>list=new ArrayList<>();
      for (int i=0;i<grocerylist.size();i++) {
          System.out.println("enter the elemnts you want to add");
          String items = scanner.nextLine();
          list.add(items);
      }
        System.out.println(list);
      if (list.containsAll(grocerylist)){
          System.out.println("both lists are equal");
      }
      else System.out.println("not equal");

    }



}
