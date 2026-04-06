package main.java;

public class SentinelSystem {
    public static void main(String[] args) {
        double temperature = 32.5;
        double humidity = 85.0;
        boolean isNight = false;
        boolean powerSaverMode = false;

        System.out.println("--- System Status Report ---");

        if (powerSaverMode) { // 0,5 Punkte
            if (temperature > 35) { // 0,5 Punkte
                System.out.println("Ventilation: ON (Emergency)"); // 0,5 Punkte
            } else { // 0,5 Punkte
                System.out.println("System: Standby"); // 0,5 Punkte
            }
        } else { // 0,5 Punkte
            if (isNight) { // 0,5 Punkte
                if (temperature < 15) { // 0,5 Punkte
                    if (humidity > 60) { // 0,5 Punkte
                        System.out.println("Heater: ON, Dehumidifier: ON"); // 0,5 Punkte
                    } else { // 0,5 Punkte
                        System.out.println("Heater: ON"); // 0,5 Punkte
                    }
                } else { // 0,5 Punkte
                    System.out.println("Security: ARMED, Temperature: STABLE"); // 0,5 Punkte
                }
            } else { // 0,5 Punkte
                if (temperature > 30) { // 0,5 Punkte
                    if (humidity > 80) { // 0,5 Punkte
                        System.out.println("AC: MAX, Vent: OPEN"); // 0,5 Punkte
                    } else { // 0,5 Punkte
                        System.out.println("AC: NORMAL"); // 0,5 Punkte
                    }
                } else { // 0,5 Punkte
                    if (temperature < 10) { // 0,5 Punkte
                        System.out.println("Warning: Low Temp"); // 0,5 Punkte
                    } else { // 0,5 Punkte
                        System.out.println("System: OPTIMAL"); // 0,5 Punkte
                    }
                }
            }
        }
    }
}

// Gesamtpunktzahl: 12,5 Punkte
