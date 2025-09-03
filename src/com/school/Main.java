package com.school;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== School Attendance System ===");

        // Create Students
        Student student1 = new Student("Alice Wonderland", "Grade 10");
        Student student2 = new Student("Bob The Builder", "Grade 9");

        // Create Teacher and Staff (from Part 5)
        Teacher teacher = new Teacher("Mr. Smith", "Mathematics");
        Staff staff = new Staff("Janet", "Administrator");

        // Display Registered People
        System.out.println("\nRegistered Students:");
        student1.displayDetails();
        student2.displayDetails();

        System.out.println("\nRegistered Teacher:");
        teacher.displayDetails();

        System.out.println("\nRegistered Staff:");
        staff.displayDetails();

        // Create Courses
        Course course1 = new Course("Intro to Programming");

        System.out.println("\nAvailable Courses:");
        course1.displayDetails();

        // Attendance Recording
        System.out.println("\n=== Attendance Recording ===");
        List<AttendanceRecord> attendanceLog = new ArrayList<>();

        // Record valid attendance
        AttendanceRecord record1 = new AttendanceRecord(student1.getId(), course1.getCourseId(), "Present");
        attendanceLog.add(record1);

        // Attempt to record invalid attendance status
        AttendanceRecord record2 = new AttendanceRecord(student2.getId(), course1.getCourseId(), "Late");
        attendanceLog.add(record2);

        // Record another valid attendance
        AttendanceRecord record3 = new AttendanceRecord(student2.getId(), course1.getCourseId(), "Absent");
        attendanceLog.add(record3);

        // Display Attendance Log
        System.out.println("\n=== Attendance Log ===");
        for (AttendanceRecord record : attendanceLog) {
            record.displayRecord();
        }

        // === Part 6: Saving Data to Files ===
        System.out.println("\n=== Saving Data to Files ===");

        // Wrap students and courses in ArrayLists (needed for FileStorageService)
        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);

        ArrayList<Course> courses = new ArrayList<>();
        courses.add(course1);

        ArrayList<AttendanceRecord> records = new ArrayList<>(attendanceLog);

        // Save data using FileStorageService
        FileStorageService storage = new FileStorageService();
        storage.saveData(students, "students.txt");
        storage.saveData(courses, "courses.txt");
        storage.saveData(records, "attendance_log.txt");

        System.out.println("\nPart 6: Data saved to files successfully.");
    }
}
