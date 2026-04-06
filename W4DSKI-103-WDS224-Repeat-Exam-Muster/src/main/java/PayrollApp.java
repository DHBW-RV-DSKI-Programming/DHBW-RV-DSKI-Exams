package main.java;

public class PayrollApp {

    public static void main(String[] args) {
        Employee softwareDeveloper = new SoftwareDeveloper(5000, 1.2); // 2 Punkte
        Employee managingDirector = new ManagingDirector(10000, 2000); // 2 Punkte

        System.out.println("Software Developer Salary: " + softwareDeveloper.calculateSalary()); // 1 Punkt
        System.out.println("Managing Director Salary: " + managingDirector.calculateSalary()); // 1 Punkt
    }

}

// Gesamtpunktzahl: 6 Punkte
