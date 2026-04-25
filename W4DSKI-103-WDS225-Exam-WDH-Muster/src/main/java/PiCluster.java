package main.java;

abstract class RaspberryPi { // 1 Punkt

    abstract void boot(); // 1 Punkt

}

class Pi4 extends RaspberryPi { // 2 Punkte

    @Override // 0,5 Punkte
    void boot() { // 1 Punkt
        System.out.println("Pi 4: Booting 8GB RAM via USB-C..."); // 1 Punkt
    }

}

class PiZero extends RaspberryPi { // 2 Punkte

    @Override // 0,5 Punkte
    void boot() { // 1 Punkt
        System.out.println("Pi Zero: Booting low-power via Micro-USB..."); // 1 Punkt
    }

}

public class PiCluster {

    public static void main(String[] args) {
        RaspberryPi[] cluster = { new Pi4(), new PiZero() }; // 2 Punkte
        for (RaspberryPi pi : cluster) { // 1 Punkt
            pi.boot(); // 1 Punkt
        }
    }

}

// Gesamtpunktzahl: 15 Punkte