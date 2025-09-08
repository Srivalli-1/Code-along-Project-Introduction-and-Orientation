package com.school;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Attendance Management Project!");

        // Create Student Array
        Student[] students = new Student[3];
        students[0] = new Student(101, "Alice");
        students[1] = new Student(102, "Bob");
        students[2] = new Student(103, "Charlie");

        // Create Course Array
        Course[] courses = new Course[2];
        courses[0] = new Course("C101", "Mathematics");
        courses[1] = new Course("C102", "Science");

        System.out.println("\n--- Student Details ---");
        for (Student student : students) {
            student.displayStudent();
        }

        System.out.println("\n--- Course Details ---");
        for (Course course : courses) {
            course.displayCourse();
        }
    }
}
