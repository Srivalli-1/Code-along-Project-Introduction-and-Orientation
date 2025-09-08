package com.school;

public class Student {
    private static int nextStudentIdCounter = 1;
    private int studentId;
    private String studentName;

    // Constructor to initialize studentName and auto-generate ID
    public Student(String studentName) {
        this.studentId = nextStudentIdCounter++;
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
