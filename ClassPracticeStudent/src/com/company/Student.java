package com.company;

public class Student {
    private String name;
    private int rollno;
    private String Adress;
    private int Phonenumber;


    public String getName() {
        return name;
    }

    public int getRollno() {
        return rollno;
    }

    public String getAdress() {
        return Adress;
    }

    public int getPhonenumber() {
        return Phonenumber;
    }

    public Student(String name, int rollno, String adress, int phonenumber) {
        this.name = name;
        this.rollno = rollno;
        this.Adress = adress;
        this.Phonenumber = phonenumber;
    }
}
