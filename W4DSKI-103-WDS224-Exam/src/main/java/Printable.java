package main.java;

interface Printable {

    default void print() {
        System.out.println("Printing...");
    }

}
