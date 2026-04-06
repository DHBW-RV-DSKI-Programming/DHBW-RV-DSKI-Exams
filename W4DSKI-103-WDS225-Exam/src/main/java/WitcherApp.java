package main.java;

// TODO: Bug(s) in Aufgabe 7 finden und lösen

class Item {
    String name;
    boolean isOiled;
    Item(String n) { name = n; isOiled = false; }
}

public class WitcherApp {

    public static void main(String[] args) {
        Item sword = new Item("Silver sword");
        int potions = 3;

        applyOil(sword);
        consumePotion(potions);

        System.out.println(sword.name + " oiled: " + sword.isOiled);
        System.out.println("Potions left: " + potions);
    }

    static void applyOil(Item item) {
        item = new Item("Neues Schwert");
        item.isOiled = true;
    }

    static void consumePotion(int count) {
        count = count - 1;
    }

}
