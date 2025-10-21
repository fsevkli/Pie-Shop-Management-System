// NutPie.java
import java.util.ArrayList;

public class NutPie extends Pie {
    private String nutType;
    private String crustType;
    
    public NutPie(String name, String nutType, String crustType, 
                  double price, ArrayList<Ingredient> ingredients) {
        super(name, "Nut Pie", price, ingredients);
        this.nutType = nutType;
        this.crustType = crustType;
    }
    
    public String getNutType() {
        return nutType;
    }
    
    public String getCrustType() {
        return crustType;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nNut Type: " + nutType + 
               ", Crust: " + crustType;
    }
}
