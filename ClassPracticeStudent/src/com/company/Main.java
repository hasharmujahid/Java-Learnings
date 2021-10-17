package com.company;

public class Main {

    public static void main(String[] args) {
        Student student1=new Student("hashar",55,"chishtian",12345);
        Student student2=new Student("tayyab",77,"lahore",22451);
        System.out.print("rollno is "+student1.getRollno()+"\n"+"phone number is "+student1.getPhonenumber()+"\n"+"Adress is "+student1.getAdress());
        System.out.print("\n"+"rollno is "+student2.getRollno()+"\n"+"phone number is "+student2.getPhonenumber()+"\n"+"Adress is "+student2.getAdress());
    }

}
