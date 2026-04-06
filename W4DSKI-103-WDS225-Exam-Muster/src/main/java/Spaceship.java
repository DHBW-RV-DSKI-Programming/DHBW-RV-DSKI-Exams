package main.java;

enum Spaceship { // 1 Punkt
    X_WING(55, "Luke Skywalker"), // 1 Punkt
    MILLENNIUM_FALCON(100, "Han Solo"), // 1 Punkt
    A_WING(40, "Lando Calrissian"), // 1 Punkt
    Y_WING(30, "Wedge Antilles"); // 1 Punkt

    private final int firepower; // 1 Punkt
    private final String pilot; // 1 Punkt

    Spaceship(int firepower, String pilot) {
        this.firepower = firepower;
        this.pilot = pilot;
    } // 1 Punkt

    public int getFirepower() { return firepower; } // 1 Punkt
    public String getPilot() { return pilot; } // 1 Punkt
}

// Gesamtpunktzahl: 10 Punkte