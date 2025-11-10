package com.school;

public class Course implements Storable {
    private static int nextCourseIdCounter = 101;

    private int courseId;
    private String courseName;

    // Constructor for new courses (auto-generates ID)
    public Course(String courseName) {
        this.courseId = nextCourseIdCounter++;
        this.courseName = courseName;
    }

    // ✅ Added constructor for loading existing courses (fixes constructor undefined error)
    public Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;

        // Keep ID counter in sync so future courses don’t duplicate IDs
        if (courseId >= nextCourseIdCounter) {
            nextCourseIdCounter = courseId + 1;
        }
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

    @Override
    public String toDataString() {
        return courseId + "," + courseName;
    }
}
