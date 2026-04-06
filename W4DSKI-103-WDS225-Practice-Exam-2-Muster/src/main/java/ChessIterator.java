package main.java;

public class ChessIterator {

    public static void main(String[] args) {
        char[][] matrix = {
                {'R', 'N', 'B', 'Q', 'K', 'B', 'N', 'R'},
                {'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'},
                {'#', '#', '#', '#', '#', '#', '#', '#'},
                {'#', '#', '#', '#', '#', '#', '#', '#'},
                {'#', '#', '#', '#', '#', '#', '#', '#'},
                {'#', '#', '#', '#', '#', '#', '#', '#'},
                {'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p'},
                {'r', 'n', 'b', 'q', 'k', 'b', 'n', 'r'}
        };

        for (int i = 0; i < matrix.length; i++) { // 1 Punkt
            for (int j = 0; j < matrix[i].length; j++) { // 1 Punkt
                if (i >=2 && i <= 5) { // 1 Punkt
                    continue; // 1 Punkt
                }
                char value = matrix[i][j]; // 1 Punkt
                System.out.print(value + " "); // 1 Punkt
            }

            if (i < 2 || i > 5) { // 1 Punkte
                System.out.println(); // 1 Punkt
            }
        }
    }

}

// Gesamtpunktzahl: 8 Punkte