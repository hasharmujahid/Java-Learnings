package com.company;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Email {
    EmailGenerator emialgenerator=new EmailGenerator();
    Password passwordgenerator2=new Password();
    private int Mailbox_capacity=500;


    public EmailGenerator getEmialgenerator() {
        return emialgenerator;
    }

    public void setEmialgenerator(EmailGenerator emialgenerator) {
        this.emialgenerator = emialgenerator;
    }

    public Password getPasswordgenerator2() {
        return passwordgenerator2;
    }

    public void setPasswordgenerator2(Password passwordgenerator2) {
        this.passwordgenerator2 = passwordgenerator2;
    }

    public int getMailbox_capacity() {
        return Mailbox_capacity;
    }

    public void setMailbox_capacity(int mailbox_capacity) {
        Mailbox_capacity = mailbox_capacity;
    }

    public Email(int mailbox_capacity) {
        Mailbox_capacity = mailbox_capacity;
    }

    public class Password {
        private String numbers="1234567890";
        private String Characters_uppercase="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        private String Characters_lowercase="abcdefghijklmnopqrstuvwxyz";
        private String Special_characetrs="!@#$%^&*";
        private Random randompassword=new Random();
        private StringBuilder Securepassword=new StringBuilder();
        public StringBuilder password(){
            String All=numbers+Characters_lowercase+Characters_uppercase+Special_characetrs;
            Scanner scanner=new Scanner(System.in);
            System.out.println("enter the length of the password");
            int lenght=scanner.nextInt();

            for (int i=0;i<=lenght;i++){
                int randomindex=randompassword.nextInt(All.length());
                Securepassword.append(All.charAt(randomindex));

            }System.out.println(Securepassword);
            return Securepassword;
        }
    }
    public class EmailGenerator {
        Scanner scanner=new Scanner(System.in);
        private String Firstname;
        private String Lastname;
        private String Department_name;
        private String Company_name;

        public String Generate(){
            System.out.println("enter first name");
            Firstname=scanner.nextLine().toLowerCase();
            System.out.println("enter Last name");

            Lastname=scanner.nextLine().toLowerCase();
            System.out.println("enter Department name \n if you dont have a department type none");
            Department_name=scanner.nextLine().toLowerCase();
            System.out.println("enter Company name");
            Company_name=scanner.nextLine().toLowerCase();
            String   Email2=Firstname+"."+Lastname+"@"+"."+Company_name+".com";
            if (!Objects.equals(Department_name, "none")){
                String Email=Firstname+"."+Lastname+"@"+Department_name+"."+Company_name+".com";


                System.out.println(Email);
                return Email;
            }
            System.out.println(Email2);
            return Email2;
        }
    }


}
