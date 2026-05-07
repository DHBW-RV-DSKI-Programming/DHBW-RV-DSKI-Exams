package main.java;

public class RomanConverter {

    private static final int[] VALUES = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] SYMBOLS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public static String toRoman(int n, int index) {
        // TODO: Hier Aufgabe 5 implementieren
        return ""; // Platzhalter
    }

    public static void main(String[] args) {
        System.out.println(toRoman(1994, 0)); // MCMXCIV
        System.out.println(toRoman(2024, 0)); // MMXXIV
        System.out.println(toRoman(58, 0)); // LVIII
        System.out.println(toRoman(3, 0)); // III
    }
}