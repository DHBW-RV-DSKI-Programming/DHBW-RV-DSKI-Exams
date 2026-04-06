package main.java;

public class TextApp {

    public static void main(String[] args) {
        String text = "to be or not to be";
        int countConsonants = TextAnalyzer.countConsonant(text);
        System.out.println("Amount consonants: " + countConsonants);
    }

}
