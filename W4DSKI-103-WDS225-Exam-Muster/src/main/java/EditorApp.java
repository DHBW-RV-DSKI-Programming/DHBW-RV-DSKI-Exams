package main.java;

public class EditorApp {

    public static void main(String[] args) {
        TextEditor myEditor = new TextEditor(5); // 0,5 Punkte
        myEditor.type("Java"); // 0,5 Punkte
        myEditor.type("PostgreSQL"); // 0,5 Punkte
        myEditor.type("Nuxt"); // 0,5 Punkte
        myEditor.undo(); // 0,5 Punkte
        myEditor.showCurrentText(); // 0,5 Punkte
    }

}

// Gesamtpunktzahl: 3 Punkte