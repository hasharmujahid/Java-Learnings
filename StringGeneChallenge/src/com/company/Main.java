package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        genetest();
    }
    public static   String genetest(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter Dna DATA  to process ");
        String inputdata=scanner.next();
        int Startcodon=inputdata.indexOf("ATG");
        System.out.println("processing for startcodon at index of "+Startcodon);
        if(Startcodon==0){
            return "";
        }
        int endcodon=inputdata.indexOf("TAA",Startcodon+3);
        System.out.println("processing for end codon at index of "+endcodon);
        if(endcodon==0){
            return "";
        }
        if ((Startcodon-endcodon)%3!=0){
            System.out.println("not a valid gene ");
            return "";
        }
        String DnaStrand=inputdata.substring(Startcodon,endcodon+3);
        System.out.println("Dna strand found is "+DnaStrand);
        return DnaStrand;

    }
}
