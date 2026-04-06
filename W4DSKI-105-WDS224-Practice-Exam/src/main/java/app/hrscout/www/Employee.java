package main.java.app.hrscout.www;

import java.time.LocalDate;

record Employee (int id, String name, String department, double salary, LocalDate hireDate) { }
