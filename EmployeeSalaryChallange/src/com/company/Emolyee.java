package com.company;

import java.util.Scanner;

public class Emolyee {
    private int salary;
    private int workhoursperday;

    public void getinfo(){
        int salary;
        int workhoursperday;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the salary ; ");
        salary=scanner.nextInt();
        this.salary=salary;
        System.out.println("enter the work hours per day ; ");
        workhoursperday=scanner.nextInt();
        this.workhoursperday=workhoursperday;
    }
    public boolean Addsalary(){
        getinfo();
        if (salary<500){
            this.salary+=10;
            System.out.println("due to less salary aditional 10dollars has been aded to your account and new salary is ; "+salary);

        }
        return false;

    }
    public void addwork(){
        Addsalary();

        if (workhoursperday>6){
            salary+=5;
            System.out.println("due to more workhoursperday , salary aditional 5 dollars has been aded to your account and new salary is ; "+salary);

        }
    }
}
