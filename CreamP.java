import java.util.ArrayList;

public class CreamP extends pie{
	
	    private String creamType;
	    private String crustType;

	    public CreamP(String creamType, String crustType, String name, double price, ArrayList<ingredient> ingri) {
	       
	    	super(name, "Cream Pies", price, ingri);
	        this.creamType = creamType;
	        this.crustType = crustType;
	    }

	    public String getCreamType() {
	        return creamType;
	    }

	    public String getCrustType() {
	        return crustType;
	    }


	    public String toString() {
	        return name+':'+ category+','+'$'+price+creamType+crustType+ingri;
	    }
	}

