// Nut.java
public class Nut extends Ingredient {
    private int nuttinessLevel;
    
    public Nut(String name, double quantity, String unit, int nuttinessLevel) {
        super(name, quantity, unit);
        this.nuttinessLevel = nuttinessLevel;
    }
    
    public int getNuttinessLevel() {
        return nuttinessLevel;
    }
    
    @Override
    public String toString() {
        return super.toString() + " [Nuttiness: " + nuttinessLevel + "/10]";
    }
}
