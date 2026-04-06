package main.java;

public class FlashTrader {

    public static void main(String[] args) {
        double[] stockPrices = {150.50, 165.00, 140.00, 130.00, 175.00, 190.00, 150.00, 210.00, 110.00, 105.00};

        System.out.println("--- Market Analysis Report ---");
        analyzePatterns(stockPrices);

        double maxProfit = calculateMaxProfit(stockPrices);
        System.out.println("\nMaximum Possible Profit: $" + maxProfit);
    }

    public static void analyzePatterns(double[] p) {
        System.out.print("Local Peaks at indices: "); // 0,5 Punkte
        for (int i = 1; i < p.length - 1; i++) { // 0,5 Punkte
            if (p[i] > p[i - 1] && p[i] > p[i + 1]) { // 0,5 Punkte
                System.out.print(i + " ($" + p[i] + ") "); // 0,5 Punkte
            }
        }

        System.out.print("\nLocal Valleys at indices: "); // 0,5 Punkte
        for (int i = 1; i < p.length - 1; i++) { // 0,5 Punkte
            if (p[i] < p[i - 1] && p[i] < p[i + 1]) { // 0,5 Punkte
                System.out.print(i + " ($" + p[i] + ") "); // 0,5 Punkte
            }
        }
    }

    public static double calculateMaxProfit(double[] p) {
        if (p == null || p.length < 2) return 0; // 1 Punkt

        double minPrice = p[0]; // 1 Punkt
        double maxProfit = 0; // 1 Punkt

        for (int i = 1; i < p.length; i++) { // 1 Punkt
            if (p[i] < minPrice) { // 1 Punkt
                minPrice = p[i]; // 1 Punkt
            } else { // 1 Punkt
                double currentProfit = p[i] - minPrice; // 1 Punkt
                if (currentProfit > maxProfit) { // 1 Punkt
                    maxProfit = currentProfit; // 1 Punkt
                }
            }
        }
        return maxProfit; // 1 Punkt
    }

}

// Gesamtpunktzahl: 15 Punkte