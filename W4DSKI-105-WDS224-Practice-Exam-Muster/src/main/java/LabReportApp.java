import java.io.FileWriter;
import java.io.IOException;

public class LabReportApp {

    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("data/LabReport.txt");
        fileWriter.write("Patient's blood test results show normal values within the reference range.");
        fileWriter.close(); // 2 Punkte
    }

}

// Gesamtpunktzahl: 2 Punkte