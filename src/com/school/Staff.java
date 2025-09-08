package com.school;

public class Staff extends Person {
    private String role;

    public Staff(String name, int age, String role) {
        super(name, age);
        this.role = role;
    }

    public String getRole() { return role; }

    @Override
    public void displayInfo() {
        System.out.println("Staff: " + getName() + ", Age: " + getAge() + ", Role: " + role);
    }
}
