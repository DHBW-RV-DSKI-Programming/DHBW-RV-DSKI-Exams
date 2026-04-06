package main.java;

public class Battleship3D {

    public static void main(String[] args) {
        char[][][] boards = new char[2][10][10]; // 1 Punkt

        for (int p = 0; p < 2; p++) { // 1 Punkt
            for (int r = 0; r < 10; r++) { // 1 Punkt
                for (int c = 0; c < 10; c++) { // 1 Punkt
                    boards[p][r][c] = '~'; // 1 Punkt
                }
            }
        }

        boolean success = placeShip(boards, 0, 1, 1, 1, 4); // 0,5 Punkte
        System.out.println("Ship placed: " + success); // 0,5 Punkte
    }

    static boolean placeShip(char[][][] board, int playerLevel, int rowStart, int columnStart, int rowEnd, int columnEnd) { // 1 Punkt
        if (rowStart < 0 || rowStart > 9 || columnStart < 0 || columnStart > 9 || rowEnd < 0 || rowEnd > 9 || columnEnd < 0 || columnEnd > 9) { // 1 Punkt
            return false; // 1 Punkt
        }

        if (rowStart != rowEnd && columnStart != columnEnd) { // 1 Punkt
            return false; // 1 Punkt
        }

        for (int i = rowStart; i <= rowEnd; i++) { // 1 Punkt
            for (int j = columnStart; j <= columnEnd; j++) { // 1 Punkt
                if (board[playerLevel][i][j] != '~') { // 1 Punkt
                    return false; // 1 Punkt
                }
            }
        }

        for (int i = rowStart; i <= rowEnd; i++) { // 1 Punkt
            for (int j = columnStart; j <= columnEnd; j++) { // 1 Punkt
                board[playerLevel][i][j] = 'S'; // 1 Punkt
            }
        }

        return true; // 1 Punkt
    }

}

// Gesamtpunktzahl: 19 Punkte