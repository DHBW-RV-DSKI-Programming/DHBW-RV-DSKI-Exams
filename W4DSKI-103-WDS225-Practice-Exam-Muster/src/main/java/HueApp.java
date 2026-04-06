package main.java;

import java.util.ArrayList;

public class HueApp {

    public static void main(String[] args) {
        HueLight light1 = new HueLight("1", "Living Room Light", true, 75, "Warm White"); // 0,5 Punkte
        HueLight light2 = new HueLight("2", "Bedroom Light", false, 0, "Cool White"); // 0,5 Punkte
        HueLight light3 = new HueLight("3", "Kitchen Light", true, 100, "Daylight"); // 0,5 Punkte

        ArrayList<HueLight> lights = new ArrayList<>(); // 1 Punkt
        lights.add(light1); // 1 Punkt
        lights.add(light2); // 1 Punkt
        lights.add(light3); // 1 Punkt

        System.out.println("Turned on lights :"); // 0,5 Punkte
        for (HueLight light : lights) { // 1 Punkt
            if (light.isOn()) { // 1 Punkt
                System.out.println(light); // 1 Punkt
            }
        }
    }

}

// Gesamtpunktzahl: 9 Punkte