// Ingredient.java
public abstract class Ingredient {
    protected String name;
    protected double quantity;
    protected String unit;
    
    public Ingredient(String name, double quantity, String unit) {
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
    }
    
    public String getName() {
        return name;
    }
    
    public double getQuantity() {
        return quantity;
    }
    
    public String getUnit() {
        return unit;
    }
    
    @Override
    public String toString() {
        return name + " (" + quantity + " " + unit + ")";
    }
}
