package com.school;

public class Student {
    private int studentId;
    private String studentName;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void displayStudent() {
        System.out.println("Student ID: " + studentId + ", Name: " + studentName);
    }
}
