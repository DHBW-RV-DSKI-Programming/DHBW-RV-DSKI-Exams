package main.java;

public class WordCounter {

    public static void main(String[] args) {
        int result1 = countSpecificWord(new String[]{"", null, ""});
        System.out.println("Result 1: " + result1); // Expected output 0

        int result2 = countSpecificWord(new String[]{});
        System.out.println("Result 2: " + result2); // Expected output -1

        String[] words = {"hello", "world", "hello", "java", "hello", "java", "java", "bonjour", "Stormtrooper", "Vim"};
        int result3 = countSpecificWord(words);
        System.out.println("Result 3: " + result3); // Expected output 3
    }

    private static int countSpecificWord(String[] words) {
        if (words.length == 0) { // 1 Punkt
            return -1; // 1 Punkt
        }

        int count = 0;
        for (String word : words) { // 1 Punkt
            if (word == null) { // 1 Punkt
                continue; // 1 Punkt
            }
            if (word.equals("java")) { // 2 Punkte
                count++; // 1 Punkt
            }
        }

        return count;
    }

}


// Gesamtpunktzahl: 8 Punkte