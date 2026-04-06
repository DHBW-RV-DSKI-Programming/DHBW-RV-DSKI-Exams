package main.java;

public class MonopolyBoard {

    private static int[][][] board = new int[11][11][1]; // 1 Punkt

    public static void main(String[] args) {
        initializeBoard(); // 0,5 Punkte
        printBoard(); // 0,5 Punkte
    }

    private static void initializeBoard() { // 0,5 Punkte
        int num1 = 1; // 1 Punkt

        // Right column (bottom to top)
        for (int i = 0; i < 11; i++) { // 1 Punkt
            board[i][10][0] = num1; // 1 Punkt
            num1 += 2; // 1 Punkt
        }

        // Bottom row (left to right)
        for (int i = 9; i >= 0; i--) { // 1 Punkt
            board[10][i][0] = num1; // 1 Punkt
            num1 += 2; // 1 Punkt
        }

        // Left column (top to bottom)
        for (int i = 9; i >= 0; i--) { // 1 Punkt
            board[i][0][0] = num1; // 1 Punkt
            num1 += 2; // 1 Punkt
        }

        // Top row (right to left)
        for (int i = 1; i < 10; i++) { // 1 Punkt
            board[0][i][0] = num1; // 1 Punkt
            num1 += 2; // 1 Punkt
        }
    }

    private static void printBoard() { // 0,5 Punkte
        for (int i = 0; i < 11; i++) { // 1 Punkt
            for (int j = 0; j < 11; j++) { // 1 Punkt
                System.out.printf("%5d ", board[i][j][0]); // 1 Punkt
            }
            System.out.println(); // 1 Punkt
        }
    }

}

// Gesamtpunktzahl: 21 Punkte
