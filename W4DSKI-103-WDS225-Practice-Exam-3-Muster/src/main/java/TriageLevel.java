package main.java;

enum TriageLevel {

    RED("Emergency", 0), // 1 Punkt
    YELLOW("Urgent", 20), // 1 Punkt
    GREEN("Non-Urgent", 120); // 1 Punkt

    private final String description; // 1 Punkt
    private final int waitTimeMinutes; // 1 Punkt

    TriageLevel(String desc, int wait) {
        this.description = desc;
        this.waitTimeMinutes = wait;
    } // 1 Punkt

    public String getStatus() { // 1 Punkt
        return description + " (Wait: " + waitTimeMinutes + "m)"; // 1 Punkt
    }

}

// Gesamtpunktzahl: 8 Punkte