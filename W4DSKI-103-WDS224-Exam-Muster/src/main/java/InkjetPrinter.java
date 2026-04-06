package main.java;

//class InkjetPrinter implements Printable {
interface InkjetPrinter extends Printable { // 2 Punkte

    @Override
//    public void print() {
    default void print() { // 1 Punkt
        System.out.println("Printing using an inkjet printer");
    }

}

// Gesamtpunktzahl: 2 Punkte