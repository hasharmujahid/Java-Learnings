package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private int number_of_Students;
    private ArrayList ID=new ArrayList();
    private ArrayList name=new ArrayList();
    private int total_revenue_generated;

    public void total_number_of_Students_enrolled(){
        Scanner scanner=new Scanner(System.in);
        try {
            System.out.println("enter the number of Students in the school");
            this.number_of_Students=scanner.nextInt();
        }catch (Exception ex){
            System.out.println("invalid value "+ex.getCause());

        }
    }
    public int calculate_fee_revenue(){

        try {
            Scanner scanner=new Scanner(System.in);
            System.out.println("enter the fee of student per month");
            int fee_of_a_single_student=scanner.nextInt();
            total_revenue_generated=number_of_Students*fee_of_a_single_student;
            System.out.println("total_revenue_generated is "+total_revenue_generated);

        }catch (Exception e){
            System.out.println("invalid value "+e.getCause());

        }return total_revenue_generated;

    }
    public void settingStudents() {
        Scanner scanner=new Scanner(System.in);
        try {

            if (number_of_Students!= 0 ) {

                for (int i = 1; i <= number_of_Students;) {
                    System.out.println("enter the name of " + i + " student");
                    name.add(scanner.nextLine());
                    System.out.println("enter the ID of " + name.get(i-1));
                    this.ID.add(i-1, scanner.nextLine());
                    i++;
                }

            }
        }catch (Exception e){
            System.out.println("invalid value "+e.getCause());
        }
    }


}
