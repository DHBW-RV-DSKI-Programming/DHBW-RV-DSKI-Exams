package main.java;

import java.util.ArrayList;

// TODO: Hier Aufgabe 7 lösen
class Cocktail {

    String name;
    double price;

    Cocktail(String name, double price) {
        this.name = name;
        this.price = price;
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
