package main.java.app.hrscout.www;

import java.util.Comparator;

class EmployeeComparator implements Comparator<Employee> { // 1 Punkt
    @Override // 1 Punkt
    public int compare(Employee e1, Employee e2) { // 1 Punkt
        // First compare by department (alphabetically)
        int departmentComparison = e1.department().compareTo(e2.department()); // 1 Punkt

        if (departmentComparison == 0) { // 1 Punkt
            // If departments are the same, compare by salary (highest to lowest)
            int salaryComparison = Double.compare(e2.salary(), e1.salary()); // 1 Punkt

            // If salaries are also the same, compare by hire date (most recent first)
            if (salaryComparison == 0) { // 1 Punkt
                return e2.hireDate().compareTo(e1.hireDate()); // 1 Punkt
            }

            return salaryComparison; // 1 Punkt
        }

        return departmentComparison; // 1 Punkt
    }
}

// Gesamtpunktzahl: 10 Punkte