package main.java;

//class LaserPrinter implements Printable {
interface LaserPrinter extends Printable { // 2 Punkte

    @Override
//    public void print() {
    default void print() { // 1 Punkt
        System.out.println("Printing using an laser printer");
    }

}

// Gesamtpunktzahl: 2 Punkte
