package com.company;

import java.util.Scanner;

public class Account {
    private String Accountnumber;
    private double AccountBalance;
    private String Customername;
    private String Email;
    private String Phonenumbebr;

    public Account(String customername, String email, String phonenumbebr) {
        this("99999",1000.0,email,customername,phonenumbebr);
        this.Customername = customername;
        this.Email = email;
        this.Phonenumbebr = phonenumbebr;
        System.out.println("3rd contrctor is called");
    }

    public Account(){
        this("123",0.0,"DEFAULT NAME ","DEF2GMAIL.COM","12345");
        System.out.println("empty constructur is called ");


    }

    public Account(String Accountnumber,double AccountbBalance,String Customername , String Email,String Phonenumber){
        this.Accountnumber=Accountnumber;
        this.AccountBalance=AccountbBalance;
        this.Customername=Customername;
        this.Email=Email;
        this.Phonenumbebr=Phonenumber;

    }

    public String getAccountnumber() {
        return Accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        Accountnumber = accountnumber;
    }

    public double getAccountBalance() {
        return AccountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        AccountBalance = accountBalance;
    }

    public String getCustomername() {
        return Customername;
    }

    public void setCustomername(String customername) {
        Customername = customername;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhonenumbebr() {
        return Phonenumbebr;
    }

    public void setPhonenumbebr(String phonenumbebr) {
        Phonenumbebr = phonenumbebr;
    }

    public void  Depositfunds(){
        int deposit_amount;
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter amount you ant to deposit ");
        deposit_amount=scanner.nextInt();

        this.AccountBalance+=deposit_amount;
        System.out.println("your now account balance is "+getAccountBalance());
    }
    public void Withdrawamount() {
        int withdrawalamount;
        System.out.println("eneter amount you want to withdraw ");
        Scanner scanner = new Scanner(System.in);
        withdrawalamount = scanner.nextInt();
        if (withdrawalamount < AccountBalance) {
            AccountBalance =  AccountBalance -withdrawalamount ;
        }
        else {
            System.out.println("you dont have a enough amount in your account");
        }
        }
    }