package main.java;

import java.util.List;

record Student(String name, List<Integer> grades) {

    public double getAverage() {
        return grades.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
    }

}

class ReportWriter {

    public void write(List<Student> students, String filePath) {
        // TODO: Hier Aufgabe 1 implementieren
    }
}

public class StudentApp {

    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Alice",   List.of(85, 90, 78)),
                new Student("Bob",     List.of(70, 65, 80)),
                new Student("Charlie", List.of(95, 98, 100))
        );

        ReportWriter writer = new ReportWriter();
        writer.write(students, "report.txt");

        System.out.println("Report written.");
    }

}
