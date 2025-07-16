package com.school;

public class Student {
    private int studentId;
    private String name;

    // Add this constructor to match Main.java
    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId + ", Name: " + name);
    }
}
