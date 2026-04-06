package main.java;

class InkjetPrinter implements Printable {

    @Override
    public void print() {
        System.out.println("Printing using an inkjet printer");
    }

}