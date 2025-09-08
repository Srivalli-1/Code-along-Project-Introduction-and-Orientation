package com.school;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Attendance Management Project!");

        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");
        Student s3 = new Student("Charlie");

        Course c1 = new Course("Mathematics");
        Course c2 = new Course("Science");

        List<AttendanceRecord> attendanceLog = new ArrayList<>();
        attendanceLog.add(new AttendanceRecord(s1.getStudentId(), c1.getCourseId(), "Present"));
        attendanceLog.add(new AttendanceRecord(s2.getStudentId(), c2.getCourseId(), "Absent"));
        attendanceLog.add(new AttendanceRecord(s3.getStudentId(), c1.getCourseId(), "Late")); // Invalid

        System.out.println("\n--- Attendance Records ---");
        for (AttendanceRecord record : attendanceLog) {
            record.displayRecord();
        }
    }
}
