package main.java;

public class DataTool {

    public static void main(String[] args) {
        int[] nums = {4, 2, 1, 7, 8, 1, 2, 8, 1, 0}; // 0,5 Punkte
        int k = 4; // 0,5 Punkte

        int currentWindowSum = 0; // 1 Punkt
        for (int i = 0; i < k; i++) { // 1 Punkt
            currentWindowSum += nums[i]; // 1 Punkt
        }
        int maxSum = currentWindowSum; // 1 Punkt

        for (int i = k; i < nums.length; i++) { // 1 Punkt
            currentWindowSum = currentWindowSum + nums[i] - nums[i - k]; // 3 Punkte

            if (currentWindowSum > maxSum) { // 2 Punkte
                maxSum = currentWindowSum; // 2 Punkte
            }
        }

        System.out.printf("The maximum sum of %d consecutive elements is: %d", k, maxSum); // 1 Punkt
    }

}

// Gesamtpunktzahl: 14 Punkte
