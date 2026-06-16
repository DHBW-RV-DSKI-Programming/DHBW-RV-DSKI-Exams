package main.java;

import java.util.Comparator;
import java.util.TreeSet;

record ProgrammingLanguage(String name, int year) {}

public class LanguageApp {

    public static void main(String[] args) {
        // TODO: Hier Aufgabe 6 lösen
        TreeSet<ProgrammingLanguage> languages = new TreeSet<>(Comparator.comparingInt(ProgrammingLanguage::year));
        languages.add(new ProgrammingLanguage("Java", 1995));
        languages.add(new ProgrammingLanguage("C++", 1983));
        languages.add(new ProgrammingLanguage("Python", 1991));
        languages.add(new ProgrammingLanguage("JavaScript", 1995));
        languages.add(new ProgrammingLanguage("C", 1972));
        languages.add(new ProgrammingLanguage("C#", 2000));
        languages.add(new ProgrammingLanguage("Ruby", 1995));
        languages.add(new ProgrammingLanguage("Go", 2009));
        languages.add(new ProgrammingLanguage("Rust", 2011));
        languages.add(new ProgrammingLanguage("Swift", 2014));

        languages.forEach(language -> System.out.printf("%s (%d)\n", language.name(), language.year()));
    }

}
