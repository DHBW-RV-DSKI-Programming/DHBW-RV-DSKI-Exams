package main.java;

public class Directory extends FileElement {

    private final FileElement[] elements;

    public Directory(String name, FileElement[] elements) {
        super(name);
        this.elements = elements;
    }

    @Override
    public boolean isDirectory() {
        return true;
    }

    public FileElement[] getElements() {
        return elements;
    }

}
