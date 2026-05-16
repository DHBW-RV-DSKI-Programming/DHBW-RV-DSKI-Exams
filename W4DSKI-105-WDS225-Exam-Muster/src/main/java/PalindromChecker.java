package main.java;

public class PalindromChecker {

    public static void main(String[] args) {
        System.out.println(isPalindrome("radar"));
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("Java"));
    }

    private static boolean isPalindrome(String s) {
        if (s.length() <= 1) { // 1 Punkt
            return true; // 1 Punkt
        }
        if (Character.toLowerCase(s.charAt(0)) != Character.toLowerCase(s.charAt(s.length() - 1))) { // 3 Punkte
            return false; // 1 Punkt
        }
        return isPalindrome(s.substring(1, s.length() - 1)); // 2 Punkte
    }

}

// Gesamtpunktzahl: 8 Punkte