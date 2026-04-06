package main.java;

class TextEditor { // 1 Punkt

    private String[] history; // 1 Punkt
    private int top; // 1 Punkt

    public TextEditor(int size) {
        this.history = new String[size];
        this.top = -1;
    } // 1 Punkt

    public void type(String text) { // 1 Punkt
        if (top < history.length - 1) { // 1 Punkt
            top++; // 1 Punkt
            history[top] = text; // 1 Punkt
        } else { // 1 Punkt
            System.out.println("Speicher voll!"); // 1 Punkt
        }
    }

    public void undo() { // 1 Punkt
        if (top >= 0) { // 1 Punkt
            System.out.println("Rückgängig: " + history[top]); // 1 Punkt
            top--; // 1 Punkt
        }
    }

    public void showCurrentText() { // 1 Punkt
        for (int i = 0; i <= top; i++) { // 1 Punkt
            System.out.print(history[i] + " "); // 1 Punkt
        }
        System.out.println(); // 1 Punkt
    }
}

// Gesamtpunktzahl: 18 Punkte
