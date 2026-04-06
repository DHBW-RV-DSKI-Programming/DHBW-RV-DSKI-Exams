package main.java;

class PrisonerClassifier {

    private final String[] litigationDecisions;

    PrisonerClassifier(String[] litigationDecisions) {
        this.litigationDecisions = litigationDecisions;
    }

    boolean lookIfPersonIsGuilty() {
        boolean isGuilty = false;
        for (String decision : this.litigationDecisions) {
            if (decision.equals("GUILTY")) {
                isGuilty = true;
                break;
            }
        }

        return isGuilty;
    }

}
