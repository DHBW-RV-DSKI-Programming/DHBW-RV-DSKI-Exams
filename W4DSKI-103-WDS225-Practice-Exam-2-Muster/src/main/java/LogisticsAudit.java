package main.java;

import java.util.ArrayList;

record Item(String id, double weight, double value, boolean isHazardous) {} // 5 Punkte

public class LogisticsAudit {
    public static void main(String[] args) {
        ArrayList manifest = new ArrayList();
        ArrayList rejected = new ArrayList();
        double weightLimit = 500.0;
        double totalInsuranceValue = 0;
        double totalWeight = 0;

        manifest.add(new Item("BAT-001", 600.0, 1500.0, true)); // 1 Punkte
        manifest.add(new Item("MED-99", 15.5, 9000.0, false)); // 1 Punkte
        manifest.add(new Item("TOOL-22", 8.0, 450.0, false)); // 1 Punkte
        manifest.add(new Item("CHEM-45", 120.0, 3200.0, true)); // 1 Punkte
        manifest.add(new Item("OLA-64", 8100.1, 10.0, false)); // 1 Punkte


        for (int i = 0; i < manifest.size(); i++) { // 2 Punkte
            Item item = (Item) manifest.get(i); // 2 Punkte

            if (item.isHazardous() || item.weight() > weightLimit) { // 1 Punkte
                rejected.add(item); // 1 Punkte
                manifest.remove(i); // 1 Punkte
                i--; // 1 Punkte
            } else { // 1 Punkte
                totalInsuranceValue += item.value(); // 1 Punkte
                totalWeight += item.weight(); // 1 Punkt
            }
        }

        double averageWeight = totalWeight / manifest.size(); // 1 Punkt

        System.out.println("Approved Items: " + manifest.size()); // 0,5 Punkte
        System.out.println("Rejected for Safety: " + rejected.size()); // 0,5 Punkte
        System.out.println("Total Insured Value: $" + totalInsuranceValue); // 0,5 Punkte
        System.out.println("Average Weight: " + averageWeight); // 0,5 Punkte
    }
}

// Gesamtpunktzahl: 24 Punkte