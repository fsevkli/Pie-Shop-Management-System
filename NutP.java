import java.util.ArrayList;


public class NutP extends pie {
	
	    private String nutType;
	    private String level;

	 public NutP(String name, String level, double price, ArrayList<ingredient> ingri) {
	     
		 super(name, "Nut Pies", price, ingri);
	     
	     this.nutType = name;
	     this.level = level;

	}
	 
	 public String toString() {
	    	return name+':'+ category+','+'$'+price+nutType+level+ingri;
	    }



}
