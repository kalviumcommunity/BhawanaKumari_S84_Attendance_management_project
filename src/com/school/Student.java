package com.school;

public class Student {
    private static int nextStudentIdCounter = 1;

    private int studentId;
    private String name;

    public Student(String name) {
        this.studentId = nextStudentIdCounter++;
        this.name = name;
    }

    // Getter for studentId
    public int getStudentId() {
        return this.studentId;
    }

    // Getter for name
    public String getName() {
        return this.name;
    }

    public void displayDetails() {
        System.out.println("Student ID: " + this.studentId + ", Name: " + this.name);
    }
}
