package main.java;

class PrisonerClassifier {

    private final String[] litigationDecisions;
    private boolean isPrisoner = false; // 3 Punkte

    PrisonerClassifier(String[] litigationDecisions) {
        this.litigationDecisions = litigationDecisions;
    }

    boolean getIsPrisoner() {
        return isPrisoner;
    } // 3 Punkte

    boolean lookIfPersonIsGuilty() {
        boolean isGuilty = false;
        for (String decision : this.litigationDecisions) {
            if (decision.equals("GUILTY")) {
                isGuilty = true;
                break;
            }
        }

        this.isPrisoner = isGuilty; // 3 Punkte

        return isGuilty;
    }

}

// Gesamtpunktzahl: 9 Punkte
