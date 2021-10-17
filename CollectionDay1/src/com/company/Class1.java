package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class Class1 <T extends Student> {
    private String class_section;
    private int class_strength;
    ArrayList<T> studentsdatabase=new ArrayList<>();
    private boolean is_enrolled = false;

    public Class1(String class_section, int class_strength) {
        this.class_section = class_section;
        this.class_strength = class_strength;

    }

    public boolean addStudent(T str ){
        if (studentsdatabase.contains(str)) {
            System.out.println("Student is already enrolled");
            return false;}
        else {
            System.out.println("we are approving hte enrollment ");
            studentsdatabase.add(str);

            return true;
        }


    }
//    public boolean check_Enrollment9() {
//        if (!is_enrolled) {
//            System.out.println("is already enrolled");
//            return false;
//        } else {
//            System.out.println("we are enrolling you ");
//            is_enrolled = true;
//            return true;
//        }
//    }
    public boolean cencle_enrollment(T str) {

        if (studentsdatabase.contains(str)) {
            System.out.println("we are cencleing the enrolllmnet");
            studentsdatabase.remove(str);
            System.out.println("enroollment cencled");
            return true;
        } else {
            System.out.println("Student doennot exisit in database");
           return false;
        }
           }

}

