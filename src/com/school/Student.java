package com.school;

public class Student extends Person implements Storable {
    private String email;

    public Student(String name, String email) {
        super(name);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toDataString() {
        return id + "," + name + "," + email;
    }
}
