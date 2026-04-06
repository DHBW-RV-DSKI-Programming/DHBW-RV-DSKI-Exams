package main.java;

abstract class Bet { // 1 Punkt

    String betDescription; // 1 Punkt

    Bet(String betDescription) {
        this.betDescription = betDescription;
    } // 1 Punkt

    abstract void resolve(boolean outcome); // 1 Punkt
}

class BinaryBet extends Bet { // 2 Punkte

    boolean prediction; // 1 Punkt

    BinaryBet(String betDescription, boolean prediction) {
        super(betDescription);
        this.prediction = prediction;
    } // 2 Punkte

    @Override // 0,5 Punkte
    void resolve(boolean outcome) { // 0,5 Punkt
        String result = (prediction == outcome) ? "Won" : "Lost"; // 1 Punkt
        System.out.println("Description: " + betDescription + " | Result: " + result); // 1 Punkt
    }
}

public class DhbwMarket {

    public static void main(String[] args) {
        Bet electionBet = new BinaryBet("Will it rain in NYC?", true);
        boolean marketOutcome = true;
        electionBet.resolve(marketOutcome);
    }

}

// Gesamtpunktzahl: 12 Punkte