package com.school;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the School Attendance System Project!");
        System.out.println("Session 2: Core Domain Modelling\n");

        System.out.println("---- School Attendance System ----\n");

        // Create student objects
        Student[] students = new Student[2];
        students[0] = new Student(1, "Alice Wonderland");
        students[1] = new Student(2, "Bob The Builder");

        // Create course objects
        Course[] courses = new Course[2];
        courses[0] = new Course("CS101", "Intro to Programming");
        courses[1] = new Course("MA202", "Linear Algebra");

        // Display students
        System.out.println("Registered Students:");
        for (Student s : students) {
            s.displayStudentInfo();
        }

        // Display courses
        System.out.println("\nAvailable Courses:");
        for (Course c : courses) {
            c.displayCourseInfo();
        }

        System.out.println("\nSession 2: Core Domain Modelling Complete.");
    }
}
