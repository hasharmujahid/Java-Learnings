package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Phonebook implements iphonebook{
    HashMap<String,Long>Phonebook=new HashMap<>();
    Scanner scanner=new Scanner(System.in);
    @Override
    public boolean add_Contacts() {
        System.out.println("How many contacts you want to add");
        int times = scanner.nextInt();
        scanner.nextLine();
        int i = 1;
        while (i <= times) {
            System.out.println("enter the name of the person");
            String element_key = scanner.nextLine().toLowerCase();
            scanner.nextLine();
            System.out.println("enter the phonenumber ");
            long Element_value = scanner.nextLong();
            if (Phonebook.containsKey(element_key) || Phonebook.containsValue(Element_value)) {
                System.out.println("this name or phone number is already defined in phone book");
                return false;
            }
            else{
                Phonebook.put(element_key, Element_value);
            System.out.println("contact successfully added");}
            i++;
        }return true;
    }

    @Override
    public boolean remove_contact() {
        System.out.println("enter the name id of the contact");
        String name=scanner.nextLine().toLowerCase();
        if (Phonebook.containsKey(name)){
            System.out.println("contact  is found initializing deletion processs");
            Phonebook.remove(name);
            return true;

            }
        else {
            System.out.println("contact doesnot found make sure to write the name correctly ");
            return false;
        }
    }

    @Override
    public String search_contact() {
        System.out.println("enter the name of the person");
        String name =scanner.nextLine().toLowerCase();
        if (Phonebook.containsKey(name)){
            System.out.println("getting info");
            System.out.println(Phonebook.get(name));
        }
        else {
            System.out.println("contact doesnot found");

        }
        return null;
    }

    @Override
    public void Print_phone_book() {
        Set<Map.Entry<String,Long>> values=Phonebook.entrySet();
        for (Map.Entry<String,Long> e:values){
            System.out.println(e.getKey()+" : "+e.getValue() );

        }

    }
}
