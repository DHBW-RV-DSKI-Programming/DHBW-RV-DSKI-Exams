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
        System.out.println(calculateMaxDepth(root));
    }

    public static int calculateMaxDepth(Category root) { // 1 Punkt
        if (root == null) { // 1 Punkt
            return 0; // 1 Punkt
        }
        int max = 0; // 1 Punkt
        for (Category sub : root.subCategories()) { // 1 Punkt
            max = Math.max(max, calculateMaxDepth(sub)); // 2 Punkte
        }
        return 1 + max; // 1 Punkt
    }

}

// Gesamtpunktzahl: 8 Punkte
