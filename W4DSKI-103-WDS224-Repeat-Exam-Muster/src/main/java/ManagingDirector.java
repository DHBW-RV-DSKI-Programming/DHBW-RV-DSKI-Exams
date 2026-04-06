package main.java;

class ManagingDirector implements Employee { // 2 Punkte

    private double baseSalary; // 1 Punkt
    private double bonus; // 1 Punkt

    ManagingDirector(double baseSalary, double bonus) {
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    } // 1 Punkt

    @Override // 1 Punkt
    public double calculateSalary() { // 1 Punkt
        return baseSalary + bonus; // 1 Punkt
    }

}

// Gesamtpunktzahl: 8 Punkte