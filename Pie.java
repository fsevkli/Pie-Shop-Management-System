// Pie.java
import java.util.ArrayList;

public abstract class Pie {
    protected String name;
    protected String category;
    protected double price;
    protected ArrayList<Ingredient> ingredients;
    
    public Pie(String name, String category, double price, ArrayList<Ingredient> ingredients) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.ingredients = ingredients;
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    
    public String getCategory() {
        return category;
    }
    
    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" (").append(category).append(") - $").append(price);
        sb.append("\nIngredients: ");
        for (Ingredient ing : ingredients) {
            sb.append(ing.toString()).append(", ");
        }
        return sb.toString();
    }
}
