package com.school;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Attendance Management Project - Part 5");

        Student s1 = new Student("Alice", 20);
        Student s2 = new Student("Bob", 22);

        Teacher t1 = new Teacher("Mr. Smith", 40, "Mathematics");
        Teacher t2 = new Teacher("Ms. Johnson", 35, "Science");

        Staff st1 = new Staff("Mr. Brown", 45, "Lab Assistant");
        Staff st2 = new Staff("Ms. Green", 30, "Librarian");

        System.out.println("\n--- Students ---");
        s1.displayInfo();
        s2.displayInfo();

        System.out.println("\n--- Teachers ---");
        t1.displayInfo();
        t2.displayInfo();

        System.out.println("\n--- Staff ---");
        st1.displayInfo();
        st2.displayInfo();
    }
}
