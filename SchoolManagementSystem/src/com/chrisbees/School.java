package com.chrisbees;

import java.util.ArrayList;
import java.util.List;

public class School {
    List<Student> students;
    List<Teacher> teachers;
    private static int totalMoneyEarned;
    private static int getTotalMoneySpent;

    public School(List<Teacher> teachers, List<Student> students) {
        this.totalMoneyEarned = 0;
        this.getTotalMoneySpent = 0;
        this.students = new ArrayList<Student>();
        this.teachers = new ArrayList<Teacher>();
    }
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public static void setTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    public int getTotalMoneySpent() {
        return getTotalMoneySpent;
    }

    public void setTotalMoneySpent(int totalMoneySpent) {
        totalMoneyEarned-=totalMoneySpent;
    }
    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(Student student) {
        students.add(student);
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher teacher) {
        teachers.add(teacher);
    }


}
