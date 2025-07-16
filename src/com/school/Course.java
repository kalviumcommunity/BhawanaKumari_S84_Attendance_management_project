package com.school;

public class Course {
    private String courseId;
    private String courseName;

    //  Add this constructor to match Main.java
    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public void displayCourseInfo() {
        System.out.println("Course ID: " + courseId + ", Name: " + courseName);
    }
}
