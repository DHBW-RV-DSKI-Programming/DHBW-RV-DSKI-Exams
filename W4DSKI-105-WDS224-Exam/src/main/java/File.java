package main.java;

public class File extends FileElement {

    private final int size; // size in kilobytes

    public File(String name, int size) {
        super(name);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

}
