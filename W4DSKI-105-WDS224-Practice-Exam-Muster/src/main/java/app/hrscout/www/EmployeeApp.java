package main.java.app.hrscout.www;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeApp {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee(1, "John Smith", "Engineering", 85000.0, LocalDate.of(2019, 3, 15)),
                new Employee(2, "Maria Garcia", "Marketing", 75000.0, LocalDate.of(2021, 6, 10)),
                new Employee(3, "Robert Johnson", "Engineering", 92000.0, LocalDate.of(2018, 1, 5)),
                new Employee(4, "Sarah Williams", "HR", 65000.0, LocalDate.of(2022, 9, 20)),
                new Employee(5, "David Lee", "Marketing", 78000.0, LocalDate.of(2020, 11, 8)),
                new Employee(6, "Jennifer Chen", "Engineering", 88000.0, LocalDate.of(2022, 4, 17)),
                new Employee(7, "Anthony Smith", "HR", 65000.0, LocalDate.of(2019, 12, 1))
        ));

        // 1. Sort by salary (highest to lowest) using lambda
        System.out.println("\nEmployees sorted by salary:");
        employees.sort(Comparator.comparingDouble(Employee::salary).reversed()); // 1 Punkt
        employees.forEach(System.out::println);

        // 2. Sort by hire date (most recent first) using lambda
        System.out.println("\nEmployees sorted by hire date:");
        employees.sort(Comparator.comparing(Employee::hireDate).reversed()); // 1 Punkt
        employees.forEach(System.out::println);

        // 3. Sort by department (alphabetically) and then by salary (highest to lowest)
        System.out.println("\nEmployees sorted by department, salary and hire date:");
        employees.sort(new EmployeeComparator()); // 1 Punkt
        employees.forEach(System.out::println);
    }

}

// Gesamtpunktzahl: 3 Punkte
