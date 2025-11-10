package com.school;

public class Person {
    private static int nextIdCounter = 1;
    protected int id;
    protected String name;

    // Constructor for new people (auto-assigns ID)
    public Person(String name) {
        this.id = nextIdCounter++;
        this.name = name;
    }

    // ✅ Added constructor for loading existing people (fixes undefined constructor errors)
    public Person(int id, String name) {
        this.id = id;
        this.name = name;

        // Ensure next ID stays ahead (avoid duplicate IDs later)
        if (id >= nextIdCounter) {
            nextIdCounter = id + 1;
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}
