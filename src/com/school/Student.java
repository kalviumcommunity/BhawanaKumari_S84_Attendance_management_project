package com.school;

public class Student extends Person {
    private String gradeLevel;

    public Student(String name, String gradeLevel) {
        super(name); // Calls the constructor of Person
        this.gradeLevel = gradeLevel;
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); // Displays ID and name
        System.out.println("Grade Level: " + this.gradeLevel);
        System.out.println("Role: Student");
    }
}
