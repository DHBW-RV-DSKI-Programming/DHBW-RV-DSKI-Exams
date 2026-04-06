package main.java;

//class MultiFunctionPrinter extends InkjetPrinter, LaserPrinter {
class MultiFunctionPrinter implements InkjetPrinter , LaserPrinter { // 1 Punkt

    @Override // 1 Punkt
    public void print() { // 1 Punkt
        System.out.println("Printing using a multifunction printer"); // 1 Punkt
        InkjetPrinter.super.print(); // 1 Punkt
        LaserPrinter.super.print(); // 1 Punkt
    }

}

// Gesamtpunktzahl: 6 Punkte
