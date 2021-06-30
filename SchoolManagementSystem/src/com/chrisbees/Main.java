package com.chrisbees;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Teacher> teacherList = new ArrayList<Teacher>();
        Teacher teacher = new Teacher(1, "Adamu", 1000);
        Teacher teacher1 = new Teacher(1, "Okeke", 800);
        Teacher teacher2 = new Teacher(3, "Obinna" , 900);
        teacherList.add(teacher);
        teacherList.add(teacher1);
        teacherList.add(teacher2);

        List<Student> studentsList = new ArrayList<Student>();
        Student student = new Student(01, "Chris", 5);

        Student student1 = new Student(02, "Tamara", 4);

        Student student2 = new Student(03, "Musa", 2);

        studentsList.add(student);
        studentsList.add(student1);
        studentsList.add(student2);

        School obiSchool = new School(teacherList, studentsList);
        student.setFeesPaid(10000);
        student1.setFeesPaid(10000);
        student2.setFeesPaid(10000);
        System.out.println(obiSchool.getTotalMoneyEarned());
    }
}
