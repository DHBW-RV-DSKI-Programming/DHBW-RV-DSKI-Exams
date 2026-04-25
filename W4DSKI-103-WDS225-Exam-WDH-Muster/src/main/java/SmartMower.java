package main.java;

public class SmartMower {

    public static void main(String[] args) {
        int[][] yard = {
                {0, 0, -1},
                {0, -1, 0},
                {0, 0, 0},
                {0, -1, 0}
        }; // 1: mown, 0: grass, -1: Rock // 3 Punkte
        int mownCount = 0; // 1 Punkt
        int rowIndex = 0; // 1 Punkt
        int columnIndex = 0; // 1 Punkt

        while (rowIndex < yard.length) { // 1 Punkt
            if (yard[rowIndex][columnIndex] != -1) { // 1 Punkt
                yard[rowIndex][columnIndex] = 1;  // 1 Punkt
                mownCount++; // 1 Punkt
                System.out.printf("Mowed [%d,%d] ", rowIndex, columnIndex); // 1 Punkt
            } else { // 1 Punkt
                System.out.printf("Obstacle at [%d,%d]! ", rowIndex, columnIndex); // 1 Punkt
            }
            columnIndex++; // 1 Punkt
            if (columnIndex == yard[rowIndex].length) { // 1 Punkt
                columnIndex = 0; // 1 Punkt
                rowIndex++; // 1 Punkt
            }
        }
        System.out.println("\nTotal area mown: " + mownCount + " units."); // 1 Punkt
    }

}

// Gesamtpunktzahl: 18 Punkte