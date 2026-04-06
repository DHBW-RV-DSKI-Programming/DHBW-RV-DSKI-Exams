package main.java;

class ChessBoard { // 1 Punkt

    private String[][][] board; // 1 Punkt

    void initBoard() { // 1 Punkt
        this.board = new String[][][]{ // 1 Punkt
                {{"R", "W"}, {"N", "W"}, {"B", "W"}, {"Q", "W"}, {"K", "W"}, {"B", "W"}, {"N", "W"}, {"R", "W"}}, // 1 Punkt
                {{"P", "W"}, {"P", "W"}, {"P", "W"}, {"P", "W"}, {"P", "W"}, {"P", "W"}, {"P", "W"}, {"P", "W"}}, // 1 Punkt
                {{null, null}, {null, null}, {null, null}, {null, null}, {null, null}, {null, null}, {null, null}, {null, null}}, // 1 Punkt
                {{null, null}, {null, null}, {null, null}, {null, null}, {null, null}, {null, null}, {null, null}, {null, null}}, // 1 Punkt
                {{null, null}, {null, null}, {null, null}, {null, null}, {null, null}, {null, null}, {null, null}, {null, null}}, // 1 Punkt
                {{null, null}, {null, null}, {null, null}, {null, null}, {null, null}, {null, null}, {null, null}, {null, null}}, // 1 Punkt
                {{"P", "B"}, {"P", "B"}, {"P", "B"}, {"P", "B"}, {"P", "B"}, {"P", "B"}, {"P", "B"}, {"P", "B"}}, // 1 Punkt
                {{"R", "B"}, {"N", "B"}, {"B", "B"}, {"Q", "B"}, {"K", "B"}, {"B", "B"}, {"N", "B"}, {"R", "B"}} // 1 Punkt
        };
    }

    void printChessBoard() { // 1 Punkt
        for (int y = 7; y >= 0; y--) { // 1 Punkt
            for (int x = 0; x < 8; x++) { // 1 Punkt
                String piece = this.board[y][x][0]; // 1 Punkt
                String color = this.board[y][x][1]; // 1 Punkt
                if (piece == null) { // 1 Punkt
                    System.out.print("x"); // 1 Punkt
                } else {
                    System.out.print(color.equals("W") ? piece.toUpperCase() : piece.toLowerCase()); // 1 Punkt
                }
                System.out.print(" "); // 1 Punkt
            }
            System.out.println(y + 1); // 1 Punkt
        }
        System.out.println("a b c d e f g h"); // 1 Punkt
    }

}

// Gesamtpunktzahl: 23 Punkte
