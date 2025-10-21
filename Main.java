// Main.java
import java.util.ArrayList;

public class Main {
    private static ArrayList<Pie> pies = new ArrayList<>();
    
    public static void addPie(Pie pie) {
        pies.add(pie);
    }
    
    public static void printAllPies() {
        System.out.println("=== Pie Shop Inventory ===\n");
        for (Pie pie : pies) {
            System.out.println(pie.toString());
            System.out.println("-------------------------\n");
        }
    }
    
    public static void main(String[] args) {
        // Create Fruit Pie
        ArrayList<Ingredient> fruitIngredients = new ArrayList<>();
        fruitIngredients.add(new Fruit("Apples", 3.0, "cups", 8));
        fruitIngredients.add(new Ingredient("Sugar", 0.5, "cup") {});
        addPie(new FruitPie("Apple Pie", "Apple", "Graham", 12.99, fruitIngredients));
        
        // Create Cream Pie
        ArrayList<Ingredient> creamIngredients = new ArrayList<>();
        creamIngredients.add(new Ingredient("Heavy Cream", 2.0, "cups") {});
        creamIngredients.add(new Ingredient("Chocolate", 1.0, "cup") {});
        addPie(new CreamPie("Chocolate Cream Pie", "Chocolate", "Cookie", 14.99, creamIngredients));
        
        // Create Nut Pie
        ArrayList<Ingredient> nutIngredients = new ArrayList<>();
        nutIngredients.add(new Nut("Pecans", 2.0, "cups", 9));
        nutIngredients.add(new Ingredient("Corn Syrup", 1.0, "cup") {});
        addPie(new NutPie("Pecan Pie", "Pecan", "Flaky", 13.99, nutIngredients));
        
        // Print all pies
        printAllPies();
    }
}
