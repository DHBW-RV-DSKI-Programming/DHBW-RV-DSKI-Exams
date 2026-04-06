package main.java;

public class GalacticDatabase {

    public static void main(String[] args) {
        String name1 = "Captain Rex";
        String name2 = new String("Captain Rex");

        if (name1.equals(name2)) { // 6 Punkte
            System.out.println("Clone CT-7567, also known as Captain Rex, is a clone trooper who served in the Grand Army of the Republic during the Clone Wars.");
        } else {
            System.out.println("Information locked.");
        }
    }

}

// Gesamtpunktzahl: 6 Punkte