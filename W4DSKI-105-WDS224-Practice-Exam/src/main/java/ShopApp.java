package main.java;

public class ShopApp {

    public static void main(String[] args) {
        Category root = new Category("Movies", new Category[]{
                new Category("Genre", new Category[]{
                        new Category("Action", new Category[]{
                                new Category("Superhero", new Category[]{}),
                                new Category("Spy", new Category[]{
                                        new Category("James Bond", new Category[]{}),
                                }),
                                new Category("Martial Arts", new Category[]{})})
                })
        });
        // TODO: Implementierung von Aufgabe 6
    }

}
