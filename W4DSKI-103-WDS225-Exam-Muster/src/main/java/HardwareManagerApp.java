package main.java;

import java.util.ArrayList;

public class HardwareManagerApp {

    public static void main(String[] args) {
        ArrayList<Hardware> cluster = new ArrayList<>();
        cluster.add(new Hardware(100, true, "Frankfurt"));
        cluster.add(new Hardware(99, true, "München"));
        cluster.add(new Hardware(30, true, "Berlin"));
        cluster.add(new Hardware(80, true, "Frankfurt"));
        cluster.add(new Hardware(12, false, "Hamburg"));
        cluster.add(new Hardware(90, true, "Frankfurt"));
        cluster.add(new Hardware(36, false, "München"));
        cluster.add(new Hardware(81, true, "München"));
        cluster.add(new Hardware(54, true, "Berlin"));
        cluster.add(new Hardware(11, true, "Hamburg"));
        cluster.add(new Hardware(0, false, "Berlin"));
        cluster.add(new Hardware(96, true, "Frankfurt"));

        ArrayList<String> locations = new ArrayList<>(); // 0,5 Punkte
        ArrayList<Integer> counts = new ArrayList<>(); // 0,5 Punkte

        for (Hardware h : cluster) { // 0,5 Punkte
            int index = locations.indexOf(h.location()); // 0,5 Punkte
            if (index == -1) { // 0,5 Punkte
                locations.add(h.location()); // 0,5 Punkte
                counts.add(1); // 0,5 Punkte
            } else {
                counts.set(index, counts.get(index) + 1); // 0,5 Punkte
            }
        }

        String topLocation = ""; // 0,5 Punkte
        int maxCount = 0; // 0,5 Punkte
        for (int i = 0; i < locations.size(); i++) { // 0,5 Punkte
            if (counts.get(i) > maxCount) { // 0,5 Punkte
                maxCount = counts.get(i);
                topLocation = locations.get(i); // 0,5 Punkte
            }
        }

        System.out.println("Top-Standort: " + topLocation); // 0,5 Punkte
    }

}

// Gesamtpunktzahl: 7 Punkte
