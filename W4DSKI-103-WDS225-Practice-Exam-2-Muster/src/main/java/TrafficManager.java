package main.java;

import java.util.ArrayList;

class APIRequest { // 1 Punkt

    static int globalLimit = 5; // 1 Punkt
    static int totalRequests = 0; // 1 Punkt
    final String endpoint; // 1 Punkt

    APIRequest(String url) {
        this.endpoint = url;
        totalRequests++;
    } // 1 Punkt

    static boolean isOverloaded() { // 1 Punkt
        return totalRequests >= globalLimit; // 1 Punkt
    }
}

public class TrafficManager {

    public static void main(String[] args) {
        ArrayList<APIRequest> queue = new ArrayList<>(); // 1 Punkt
        String[] logs = {"/login", "/data", "/buy", "/logout", "/ping", "/status"}; // 1 Punkt

        for (String url : logs) { // 1 Punkt
            if (APIRequest.isOverloaded()) { // 1 Punkt
                System.out.println("Blocked: " + url + " (Global Limit Reached)"); // 1 Punkt
            } else { // 1 Punkt
                queue.add(new APIRequest(url)); // 1 Punkt
                System.out.println("Processing: " + url); // 1 Punkt
            }
        }
    }

}

// Gesamtpunktzahl: 15 Punkte
