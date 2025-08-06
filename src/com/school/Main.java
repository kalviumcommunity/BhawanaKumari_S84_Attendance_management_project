package com.school;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");
        Student student3 = new Student("Charlie");

        Course course1 = new Course("Mathematics");
        Course course2 = new Course("Science");
        Course course3 = new Course("English");

        System.out.println("\nStudent Details:");
        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();

        System.out.println("\nCourse Details:");
        course1.displayDetails();
        course2.displayDetails();
        course3.displayDetails();
    }
}
