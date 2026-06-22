package com.shreya.expensetracker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
    @GetMapping("/expenses")
    public List<Expenses> expenses() {

        return List.of(
                new Expenses("Food", 200),
                new Expenses("Travel", 100)
        );
    }
    @GetMapping("/students")
    public List<Student> students() {
        return List.of(
                new Student("Shreya","CSE",20),
                new Student("Allen","CSE",35)
        );
    }
    @GetMapping("/books")
    public List<Book> books() {
        return List.of(
                new Book("Alaska","Jammie"),
                new Book("Kite","Sam")
        );
    }

}
