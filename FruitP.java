import java.util.ArrayList;

public class FruitP extends pie {
	    
		private String typeCream;
	    private String crustType;

	    public FruitP(String typeCream, String crustType, String name, double price, ArrayList<ingredient> ingri) {
	        
	    	super(name, "Fruit Pie", price, ingri);
	        this.typeCream = typeCream;
	        this.crustType = crustType;
	    }

	    public String getTypeCream() {
	        return typeCream;
	    }

	    public String getCrustType() {
	        return crustType;
	    }


	    public String toString() {
	    	return name+':'+ category+','+'$'+price+typeCream+crustType+ingri;
	    }
	}


