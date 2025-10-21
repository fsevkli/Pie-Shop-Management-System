// FruitPie.java
import java.util.ArrayList;

public class FruitPie extends Pie {
    private String fruitType;
    private String crustType;
    
    public FruitPie(String name, String fruitType, String crustType, 
                    double price, ArrayList<Ingredient> ingredients) {
        super(name, "Fruit Pie", price, ingredients);
        this.fruitType = fruitType;
        this.crustType = crustType;
    }
    
    public String getFruitType() {
        return fruitType;
    }
    
    public String getCrustType() {
        return crustType;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nFruit Type: " + fruitType + 
               ", Crust: " + crustType;
    }
}
