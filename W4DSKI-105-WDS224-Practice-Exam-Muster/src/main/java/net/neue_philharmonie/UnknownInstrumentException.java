package main.java.net.neue_philharmonie;

import java.util.List;

public class UnknownInstrumentException extends Exception { // 1 Punkte

    List<String> unknownInstruments; // 0,5 Punkte

    public UnknownInstrumentException(String message, List<String> unknownInstruments) { // 1 Punkt
        super(message); // 1 Punkt
        this.unknownInstruments = unknownInstruments;
    }

    public List<String> getUnknownInstruments() {
        return unknownInstruments;
    } // 0,5 Punkte

}

// Gesamtpunktzahl: 4 Punkte