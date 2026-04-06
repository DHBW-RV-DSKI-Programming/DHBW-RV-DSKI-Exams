package main.java;

public class GalacticDatabase {

    public static void main(String[] args) {
        // TODO: Hier Aufgabe 9 lösen
        String name1 = "Captain Rex";
        String name2 = new String("Captain Rex");

        if (name1 == name2) {
            System.out.println("Clone CT-7567, also known as Captain Rex, is a clone trooper who served in the Grand Army of the Republic during the Clone Wars.");
        } else {
            System.out.println("Information locked.");
        }
    }

}