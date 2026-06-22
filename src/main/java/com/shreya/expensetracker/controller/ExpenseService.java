package com.shreya.expensetracker.controller;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {
    public List<Expenses> getExpenses(){
        return List.of(
                new Expenses("Food", 200),
                new Expenses("Travel", 100)
        );
    }
}
