package com.school;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class FileStorageService {

    public void saveData(List<? extends Storable> data, String fileName) {
        try (PrintWriter out = new PrintWriter(new FileWriter(fileName, false))) {
            for (Storable item : data) {
                out.println(item.toDataString());
            }
            System.out.printf("✅ Saved %d record(s) to %s%n", data.size(), fileName);
        } catch (IOException e) {
            System.err.printf("❌ Error writing %s: %s%n", fileName, e.getMessage());
        }
    }

    public void saveStudents(List<Student> students) {
        saveData(students, "students.txt");
    }

    public void saveTeachers(List<Teacher> teachers) {
        saveData(teachers, "teachers.txt");
    }

    public void saveStaff(List<Staff> staffMembers) {
        saveData(staffMembers, "staff.txt");
    }

    public void saveCourses(List<Course> courses) {
        saveData(courses, "courses.txt");
    }

    public void saveAttendance(List<AttendanceRecord> records) {
        saveData(records, "attendance_log.txt");
    }
}
