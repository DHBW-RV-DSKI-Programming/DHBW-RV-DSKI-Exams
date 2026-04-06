package main.java;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class KehrwocheApp {

    public static void main(String[] args) {
        // TODO: Hier Aufgabe 1 implementieren
    }

    // Kann genutzt werden, um 100 neue Dateien zu generieren (Ausgangssituation).
    private static void generateNewFiles() throws IOException {
        for (int i = 0; i < 100; i++) {
            File newFile = new File("data/file" + i + ".txt");
            FileWriter fw = new FileWriter(newFile);
            fw.write("File content. Nr. " + i+1);
            fw.close();
        }
    }

}
