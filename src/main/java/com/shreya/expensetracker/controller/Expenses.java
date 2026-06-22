package com.shreya.expensetracker.controller;

public class Expenses {
    private String title;
    private int amount;
    public Expenses(String title, int amount) {
        this.title = title;
        this.amount = amount;
    }
    public String getTitle() {
        return title;
    }
    public int getAmount() {
        return amount;
    }
}
