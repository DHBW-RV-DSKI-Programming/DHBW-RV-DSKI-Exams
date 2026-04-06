package main.java;

import java.util.ArrayList;

class Cocktail {

    String name;
    double price;

    Cocktail(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override // 1 Punkt
    public boolean equals(Object o) { // 1 Punkt
        if (this == o) return true; // 1 Punkt
        if (o == null || getClass() != o.getClass()) return false; // 1 Punkt
        Cocktail cocktail = (Cocktail) o; // 1 Punkt
        return this.name.equals(cocktail.name) && this.price == cocktail.price; // 1 Punkt
    }

}

public class HighEndBar {

    public static void main(String[] args) {
        ArrayList<Cocktail> menu = new ArrayList<>();
        menu.add(new Cocktail("Negroni", 12.0));
        menu.add(new Cocktail("Martini", 14.0));

        Cocktail orderedDrink = new Cocktail("Negroni", 12.0);
        System.out.println("Is on menu? " + menu.contains(orderedDrink));
    }

}

// Gesamtpunktzahl: 6 Punkte
