package main.java;

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
//        consumePotion(potions);
        potions = consumePotion(potions); // 1,5 Punkte

        System.out.println(sword.name + " oiled: " + sword.isOiled);
        System.out.println("Potions left: " + potions);
    }

    static void applyOil(Item item) {
//        item = new Item("Neues Schwert"); // 1,5 Punkte
        item.isOiled = true;
    }

//    static void consumePotion(int count) {
    static int consumePotion(int count) { // 1,5 Punkte
        count = count - 1;
        return count; // 1,5 Punkte
    }

}

// Gesamtpunktzahl: 6 Punkte