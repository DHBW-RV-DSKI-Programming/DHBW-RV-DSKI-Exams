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
        if (!element.isDirectory()) { // 1 Punkt
            // It's a file, so return its size
            return ((File) element).getSize(); // 1 Punkt
        } else { // 1 Punkt
            // It's a directory, sum sizes of its elements recursively
            int total = 0; // 1 Punkt
            FileElement[] subElements = ((Directory) element).getElements(); // 1 Punkt
            for (FileElement sub : subElements) { // 1 Punkt
                total += calculateTotalSize(sub); // 1 Punkt
            }
            return total; // 1 Punkt
        }
    }

}

// Gesamtpunktzahl: 8 Punkte
