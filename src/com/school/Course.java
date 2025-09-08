package com.school;

public class Course {
    private static int nextCourseIdCounter = 101;
    private int courseId;
    private String courseName;

    // Constructor to initialize courseName and auto-generate ID
    public Course(String courseName) {
        this.courseId = nextCourseIdCounter++;
        this.courseName = courseName;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void displayCourse() {
        System.out.println("Course ID: C" + courseId + ", Course Name: " + courseName);
    }
}
