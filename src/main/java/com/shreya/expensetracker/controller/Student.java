package com.shreya.expensetracker.controller;

public class Student {
    private String name;
    private String branch;
    private int id;
    public Student(String name, String branch, int id) {
        this.name = name;
        this.branch = branch;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public String getBranch() {
        return branch;
    }
    public int getId() {
        return id;
    }
}
