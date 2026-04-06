package main.java;

import java.util.ArrayList;

public class LegalApp {

    public static void main(String[] args) {
        ArrayList<PrisonerClassifier> prisonerClassifiers = new ArrayList<>();

        for (int i = 0; i < 1000000; i++) {
            String[] litigationDecisions = new String[100];
            for (int j = 0; j < 100; j++) {
                litigationDecisions[j] = new String[]{"NOT GUILTY", "GUILTY"}[Math.random() < 0.5 ? 0 : 1];
            }
            PrisonerClassifier prisonerClassifier = new PrisonerClassifier(litigationDecisions);
            prisonerClassifiers.add(prisonerClassifier);
        }

        calculateGuilty(prisonerClassifiers);

        flagGuilty(prisonerClassifiers);
    }

    private static void calculateGuilty(ArrayList<PrisonerClassifier> prisonerClassifiers) {
        long[] durations = new long[10];
        for (int i = 0; i < 10; i++) {
            long startTime = System.nanoTime();
            ArrayList<PrisonerClassifier> aboveThreshold = new ArrayList<>();
            for (PrisonerClassifier unit : prisonerClassifiers) {
                if (unit.lookIfPersonIsGuilty()) {
                    aboveThreshold.add(unit);
                }
            }
            long endTime = System.nanoTime();
            long duration = (endTime - startTime) / 1000;
            System.out.println("Filtering took " + duration + " µs");
            durations[i] = duration;
        }
        double sum = 0;
        for (long duration : durations) {
            sum += duration;
        }
        System.out.println("Average filtering took " + sum / 10 + " µs");
    }

    private static void flagGuilty(ArrayList<PrisonerClassifier> prisonerClassifiers) {
        long[] durations2 = new long[10];
        for (int i = 0; i < 10; i++) {
            long startTime = System.nanoTime();
            ArrayList<PrisonerClassifier> aboveThreshold = new ArrayList<>();
            for (PrisonerClassifier unit : prisonerClassifiers) {
                // TODO: Insert filtering of flagged guilty prisoners
                aboveThreshold.add(unit);
            }
            long endTime = System.nanoTime();
            long duration = (endTime - startTime) / 1000;
            System.out.println("Filtering took " + duration + " µs");
            durations2[i] = duration;
        }
        double sum2 = 0;
        for (long duration : durations2) {
            sum2 += duration;
        }
        System.out.println("Average filtering took " + sum2 / 10 + " µs");
    }

}
