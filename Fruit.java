// Fruit.java
public class Fruit extends Ingredient {
    private int sweetnessLevel;
    
    public Fruit(String name, double quantity, String unit, int sweetnessLevel) {
        super(name, quantity, unit);
        this.sweetnessLevel = sweetnessLevel;
    }
    
    public int getSweetnessLevel() {
        return sweetnessLevel;
    }
    
    @Override
    public String toString() {
        return super.toString() + " [Sweetness: " + sweetnessLevel + "/10]";
    }
}
