package com.company;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Student student=new Student("hashar");
        Class1<Student> class1=new Class1<>("four shine",33);
        class1.addStudent(student);
        class1.addStudent(student);
        class1.cencle_enrollment(student);

    }
}
