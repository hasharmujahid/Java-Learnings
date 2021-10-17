package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Teacher {
    private int number_of_teachers;
    private ArrayList ID=new ArrayList();
    private ArrayList name=new ArrayList();
    private int total_salaries_to_be_paid;



    public void total_number_of_teachers_enrollment(){
        Scanner scanner=new Scanner(System.in);
        try {
            System.out.println("enter the number of teachers in the school");
            this.number_of_teachers=scanner.nextInt();
        }catch (Exception ex){
            System.out.println("invalid value "+ex.getCause());

        }




        }

    public int calculate_salary(){
        Scanner scanner=new Scanner(System.in);

            System.out.println("enter the universal salary per month");
            int salary_of_single_teacher=scanner.nextInt();
            total_salaries_to_be_paid=number_of_teachers*salary_of_single_teacher;
            System.out.println("total salaries to be paid are "+total_salaries_to_be_paid);
            return total_salaries_to_be_paid;

    }
    public void settingteachers() {
        Scanner scanner=new Scanner(System.in);
       try {

           if (number_of_teachers != 0 ) {

               for (int i = 1; i <= number_of_teachers;) {
                   System.out.println("enter the name of " + i + " teacher");
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






