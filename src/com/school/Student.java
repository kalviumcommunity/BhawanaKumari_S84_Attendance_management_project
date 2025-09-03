package com.school;

public class Student extends Person implements Storable {
    private String gradeLevel;

    // Student constructor matches Person(String name)
    public Student(String name, String gradeLevel) {
        super(name); // Person assigns numeric ID automatically
        this.gradeLevel = gradeLevel;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Grade Level: " + this.gradeLevel);
        System.out.println("Role: Student");
    }

    @Override
    public String toDataString() {
        return getId() + "," + getName() + "," + gradeLevel;
    }
}
