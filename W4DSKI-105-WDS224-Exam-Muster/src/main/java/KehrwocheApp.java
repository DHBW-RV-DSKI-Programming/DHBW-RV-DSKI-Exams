package main.java;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class KehrwocheApp {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) { // 1 Punkt
            File file = new File("data/file" + i + ".txt"); // 1 Punkt
            if (!file.exists()) { // 1 Punkt
                continue; // 1 Punkt
            }
            boolean isDeleted = file.delete(); // 1 Punkt
            System.out.printf("%s deleted: %s%n", file.getName(), isDeleted); // 1 Punkt
        }
    }

    // Kann genutzt werden, um 100 neue Dateien zu generieren (Ausgangssituation).
    private static void generateNewFiles() throws IOException {
        for (int i = 0; i < 100; i++) {
            File newFile = new File("data/file" + i + ".txt");
            FileWriter fw = new FileWriter(newFile);
            fw.write("File content. Nr. " + i);
            fw.close();
        }
    }

}

// Gesamtpunktzahl: 6 Punkte