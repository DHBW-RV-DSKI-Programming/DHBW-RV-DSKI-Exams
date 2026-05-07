package main.java;

import java.util.List;
import java.io.FileWriter;
import java.io.IOException;

record Student(String name, List<Integer> grades) {

    public double getAverage() {
        return grades.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
    }

}

class ReportWriter {

    public void write(List<Student> students, String filePath) throws IOException { // 0,5 Punkte
        FileWriter fw = new FileWriter(filePath); // 1 Punkt

        for (Student s : students) { // 1 Punkt
            fw.write("Name: " + s.name() + "\n"); // 1 Punkt
            fw.write("Grades: " + s.grades() + "\n"); // 1 Punkt
            fw.write("Average: " + s.getAverage() + "\n"); // 1 Punkt
            fw.write("\n"); // 1 Punkt
        }

        fw.close(); // 1 Punkt
    }
}

public class StudentApp {

    public static void main(String[] args) throws IOException { // 0,5 Punkte
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

// Gesamtpunktzahl: 8 Punkte
