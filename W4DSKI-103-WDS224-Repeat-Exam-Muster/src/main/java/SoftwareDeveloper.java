package main.java;

record SoftwareDeveloper(double salary, double efficiencyFactor) implements Employee { // 4 Punkte

    @Override // 1 Punkt
    public double calculateSalary() { // 1 Punkt
        return salary * efficiencyFactor; // 1 Punkt
    }

}

// Gesamtpunktzahl: 7 Punkte