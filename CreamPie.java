// CreamPie.java
import java.util.ArrayList;

public class CreamPie extends Pie {
    private String creamType;
    private String crustType;
    
    public CreamPie(String name, String creamType, String crustType, 
                    double price, ArrayList<Ingredient> ingredients) {
        super(name, "Cream Pie", price, ingredients);
        this.creamType = creamType;
        this.crustType = crustType;
    }
    
    public String getCreamType() {
        return creamType;
    }
    
    public String getCrustType() {
        return crustType;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nCream Type: " + creamType + 
               ", Crust: " + crustType;
    }
}
