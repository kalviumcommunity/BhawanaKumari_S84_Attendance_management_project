package com.school;

public class Teacher extends Person {
    private String subjectTaught;

    public Teacher(String name, String subjectTaught) {
        super(name); // call Person constructor
        this.subjectTaught = subjectTaught;
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); // prints ID and name
        System.out.println("Subject Taught: " + this.subjectTaught);
        System.out.println("Role: Teacher");
    }
}
