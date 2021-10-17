package com.company;

public  class Student {


    private String Student_name;



    public Student(String student_name) {
        Student_name = student_name;

    }



//    public boolean cencle_enrollment() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter the name of the student you want to cencle the enrollment");
//        String str = scanner.nextLine();
//        if (Students.contains(str)) {
//            System.out.println("we are cencleing the enrolllmnet");
//            Students.remove(str);
//            System.out.println("enroollment cencled");
//            return true;
//        } else {
//            System.out.println("Student doennot exisit in database");
//            return false;
//        }
//    }

    public String getStudent_name() {
        return Student_name;
    }


//    public boolean addenrollment(String str) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter the name of the student you want to cencle the enrollment");
//        str = scanner.nextLine();
//        if (Students.contains(str)) {
//            System.out.println("Student is alraeady enrolled");
//            return false;
//        } else{
//            Students.add(str);
//            System.out.println("Student is enrolled ....");
//            return true;
//        }
//    }
}