package main.java;

import java.util.ArrayList;

public class NewsFeed {

    public static void main(String[] args) {
        ArrayList<String> liveAlerts = new ArrayList<>(); // 1 Punkt
        liveAlerts.add("Did Scientists Just Detect an Exploding Black Hole?"); // 1 Punkt
        liveAlerts.add("The best food items at MLB parks this season, and how some of them came to be"); // 1 Punkt
        liveAlerts.add("No, Britain Is Not Having a Christian Revival"); // 1 Punkt
        for (String alert : liveAlerts) { // 1 Punkt
            System.out.println("FLASH: " + alert); // 1 Punkt
        }
    }

}

// Gesamtpunktzahl: 6 Punkte