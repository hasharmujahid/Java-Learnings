package com.company;

import java.util.*;

public class Demo1 {
    private Scanner scanner=new Scanner(System.in);
    private LinkedList<String> first=new LinkedList<>();
    private LinkedList<String> second=new LinkedList<>();
    public void add_element(){
        System.out.print("how many element you want to add in the list this time--->");
        int times=scanner.nextInt();
        System.out.println("Authorizing the count ........\n "+times+" counts have been authorized ");
        int i=1;
        while (i<=times){
            System.out.println("press enter...... ");
            scanner.nextLine();

            System.out.print("enter the elemnt you want to add ----> ");

            String element = scanner.nextLine().toLowerCase();
           first.add(element);
            System.out.println(element+" has been added ");
            i++;
            System.out.println(first);
        }

    }
    public void add_element2(){
        System.out.print("how many element you want to add in the list this time--->");
        int times=scanner.nextInt();
        System.out.println("Authorizing the count ........\n "+times+" counts have been authorized ");
        int i=1;
        while (i<=times){
            System.out.println("press enter...... ");
            scanner.nextLine();

            System.out.print("enter the elemnt you want to add ----> ");

            String element = scanner.nextLine().toLowerCase();
            second.add(element);
            System.out.println(element+" has been added ");
            i++;
            System.out.println(second);
        }

    }

    public void remove() {
        System.out.print("enter the element you want to remove-->");
        String element = scanner.nextLine().toLowerCase();
        if (first.contains(element)) {
            System.out.println("target found ..... \n initiating attack ");
            first.remove(element);
            System.out.println(element+ " target neutarlized");
        }
    }
    public void printlist(){
        Iterator<String>iterator=first.iterator();
        int i=0;
        while (iterator.hasNext()){
            System.out.println(i+" "+iterator.next());
            i++;

        }
    }
    public void addsingle_element(){
        System.out.println("enter the element you want to add--->");
        String element=scanner.nextLine();
        System.out.println("write the index where you want to add ");
        int index=scanner.nextInt();
        first.add(index,element);

    }
    public void addinfront(){
        System.out.println("enter the element ");
        String element=scanner.nextLine();
        first.addFirst(element);

    }
    public void addinlast(){
        System.out.println("enter the element ");
        String element=scanner.nextLine();
        first.addLast(element);

    }
    public void removeall(){
        System.out.println("doyou want to creal all the element from the list");
        System.out.println("press 1 to delete all or 0 to cencle the operation");
        int i=scanner.nextInt();
        if (i!=0 && i!=1){
            System.out.println("Invalid option");
        }else {
            if (i==1){
                first.clear();
                System.out.println("all items are deleted");
            }
            if (i==0){
                System.out.println("cenceling hte operation");
            }
        }
    }
    public void swapvalues(){
        System.out.print("add element 1 --->");
        String element=scanner.nextLine();
        System.out.print("enter element 2 --->");
        String element2=scanner.nextLine();
        if (first.contains(element) && first.contains(element2)){
            int index1=first.indexOf(element);
            System.out.println("index of element 1 is ---->"+index1);

            int index2=first.indexOf(element2);
            System.out.println("index  of element 2 is --->"+index2);
            first.remove(index2);
            first.add(index2,element);
            first.remove(index1);
            first.add(index1,element2);
            System.out.println(first);


        }
        else {
            System.out.println("element does'nt exists ");
        }
    }
    public void shuffle(){
        Collections.shuffle(first);

    }
    public void join2(){
        first.addAll(second);
        System.out.println(first);

    }
    public void cloneing(){
        LinkedList<String>clone=new LinkedList<>();
        clone=(LinkedList)first.clone();

        System.out.println(clone);
    }


}
