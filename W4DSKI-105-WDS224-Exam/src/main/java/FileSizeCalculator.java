package main.java;

public class FileSizeCalculator {

    public static void main(String[] args) {
        FileElement myFiles = new Directory("root", new FileElement[]{
                new File("resume.pdf", 12),
                new Directory("photos", new FileElement[]{
                        new File("vacation.jpg", 2500),
                        new File("family.png", 800)
                }),
                new Directory("music", new FileElement[]{
                        new File("song.mp3", 7000)
                })
        });
        System.out.printf("Total KB size: %s", calculateTotalSize(myFiles));
    }

    public static int calculateTotalSize(FileElement element) {
        // TODO: Hier Aufgabe 5 implementieren
        return 0; // TODO: Mit Beginn der Aufgabe diesen Platzhalter ersetzen.
    }

}
