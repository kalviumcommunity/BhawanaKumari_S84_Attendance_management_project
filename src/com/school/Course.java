package com.school;

public class Course {
    private static int nextCourseIdCounter = 101;

    private int courseId;
    private String courseName;

    public Course(String courseName) {
        this.courseId = nextCourseIdCounter++;
        this.courseName = courseName;
    }

    // Getter for courseId
    public int getCourseId() {
        return this.courseId;
    }

    // Getter for courseName
    public String getCourseName() {
        return this.courseName;
    }

    public void displayDetails() {
        System.out.println("Course ID: " + this.courseId + ", Name: " + this.courseName);
    }
}
