package com.company;

public class School {
    private Teacher teacher=new Teacher();
    private Student student=new Student();
    private int total_earnings;

    public Teacher getTeacher() {
        return teacher;
    }

    public Student getStudent() {
        return student;
    }

    public int getTotal_earnings() {
        return total_earnings;
    }

    public void remainigrevenu(){
        int student_fee=student.calculate_fee_revenue();
        int teacher_salary=teacher.calculate_salary();
        total_earnings=student_fee-teacher_salary;
        System.out.println("total revenue earned is "+total_earnings);
    }
    public void setup(){
        teacher.total_number_of_teachers_enrollment();
        teacher.settingteachers();
        student.total_number_of_Students_enrolled();
        student.settingStudents();
    }

}
