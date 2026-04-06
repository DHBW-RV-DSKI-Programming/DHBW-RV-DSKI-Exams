package main.java;

public class MephistoPakt {

    public static void main(String[] args) {
        boolean gestoppt = false;
        int streben = 100;
        String charakter = "Faust";

        int punkte = (streben > 50) ? 10 : 0; // 1 Punkt

        punkte += (charakter.equals("Mephisto")) ? 5 : 2; // 1 Punkt

        punkte = (gestoppt) ? punkte - 10 : punkte + 5; // 1 Punkt

        punkte += (punkte > 15) ? (streben < 200 ? 20 : 30) : 5; // 1 Punkt

        String resultat = (punkte > 35) ? "Gerettet" : "Verloren"; // 1 Punkt

        System.out.println(resultat + ": " + punkte); // 1 Punkt
    }

}

// Gesamtpunktzahl: 6 Punkte