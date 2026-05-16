package main.java;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class LogWriter {

    public static void main(String[] args) {
        List<String> logs = List.of(
                "[INFO]  Server gestartet... oder auch nicht. Wer weiß das schon.",
                "[WARN]  Kaffeemaschine antwortet nicht. Kritischer Systemfehler.",
                "[ERROR] Entwickler hat vergessen, Mittagspause zu beenden. Timeout nach 3h.",
                "[INFO]  Build erfolgreich. Zum ersten Mal seit Dienstag.",
                "[WARN]  Kollege benutzt noch Java 8. Bitte Notarzt verständigen.",
                "[ERROR] NullPointerException in Produktion. Niemand überrascht.",
                "[INFO]  Standup-Meeting dauerte nur 45 Minuten. Neuer Rekord.",
                "[WARN]  Jemand hat 'es funktioniert auf meinem Rechner' gesagt.",
                "[ERROR] Praktikant hat direkt auf main gepusht. Alle Alarme aktiv.",
                "[INFO]  System wird heruntergefahren. Bis morgen, ihr schönen Exceptions."
        );

        writeLog(logs);
    }

    // TODO: Hier Aufgabe 6 lösen
    private static void writeLog(List<String> entries) {
        String fileName = "data/server.log";

        try {
            File file = new File(fileName);
            if (file.exists()) {
                boolean deleted = file.delete();
                System.out.printf("File %s deleted: %b%n", fileName, deleted);
            }

            boolean created = file.createNewFile();
            System.out.printf("File %s created: %b%n", fileName, created);

            FileWriter writer = new FileWriter(fileName);
            for (String entry : entries) {
                writer.write(entry + "\n");
            }
        } catch (IOException e) {
            System.out.println("Problem with files: " + e.getMessage());
        }
    }

}
