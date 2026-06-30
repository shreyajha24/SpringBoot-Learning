package com.shreya.expensetracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExpenseTrackerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExpenseTrackerApplication.class, args);
    }

}//Why should the class annotated with @SpringBootApplication be placed in the root package?
//Because @SpringBootApplication includes @ComponentScan, which scans the package containing the main application class and all its sub-packages. Placing it in the root package ensures that Spring discovers all controllers, services, repositories, and other components in the application.
//note down to notes