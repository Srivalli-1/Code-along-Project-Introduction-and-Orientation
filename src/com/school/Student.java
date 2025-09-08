package com.school;

public class Student extends Person {
    private static int nextStudentIdCounter = 1;
    private int studentId;

    public Student(String name, int age) {
        super(name, age);
        this.studentId = nextStudentIdCounter++;
    }

    public int getStudentId() { return studentId; }

    @Override
    public void displayInfo() {
        System.out.println("Student ID: " + studentId + ", Name: " + getName() + ", Age: " + getAge());
    }
}
