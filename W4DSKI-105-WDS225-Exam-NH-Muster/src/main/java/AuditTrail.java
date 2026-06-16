package main.java;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AuditTrail {

    public static void main(String[] args) throws IOException { // 1 Punkt
        File file = new File("audit.log"); // 1 Punkt
        FileWriter fw = new FileWriter(file, true); // 2 Punkte
        fw.write("=== finish audit trail ==="); // 1 Punkt
        fw.close(); // 1 Punkt
    }

}

// Gesamtpunktzahl: 6 Punkte