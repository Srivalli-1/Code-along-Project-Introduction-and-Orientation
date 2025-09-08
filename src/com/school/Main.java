package com.school;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Attendance Management Project!");

        // Create Student Array with auto-generated IDs
        Student[] students = new Student[4];
        students[0] = new Student("Alice");
        students[1] = new Student("Bob");
        students[2] = new Student("Charlie");
        students[3] = new Student("Daisy");

        // Create Course Array with auto-generated IDs
        Course[] courses = new Course[3];
        courses[0] = new Course("Mathematics");
        courses[1] = new Course("Science");
        courses[2] = new Course("English");

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
