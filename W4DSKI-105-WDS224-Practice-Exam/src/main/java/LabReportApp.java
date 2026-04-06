package main.java;

import java.io.FileWriter;
import java.io.IOException;

public class LabReportApp {

    // TODO: Löse Aufgabe 5

    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("data/LabReport.txt");
        fileWriter.write("Patient's blood test results show normal values within the reference range.");
    }

}
