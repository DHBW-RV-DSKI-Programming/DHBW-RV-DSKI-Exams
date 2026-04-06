package main.java;

public class FileElement {

    private final String name;

    public FileElement(String name) {
        this.name = name;
    }

    public boolean isDirectory() {
        // returns true if this is a Directory, false if File
        // implemented in subclasses
        return false;
    }
}
