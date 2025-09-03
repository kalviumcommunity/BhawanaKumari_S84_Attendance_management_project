package com.school;

public class Staff extends Person {
    private String role;

    public Staff(String name, String role) {
        super(name); // calls Person constructor
        this.role = role;
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); // prints ID and name
        System.out.println("Staff Role: " + this.role);
        System.out.println("Role: Staff");
    }
}
