import java.util.ArrayList;

public class pie {
	
	protected String category;
	protected double price;
	protected ArrayList<ingredient> ingri = new ArrayList<ingredient>();
	protected String name;
	
	public pie(String name, String category, double price, ArrayList<ingredient> ingri) {
		
		this.category = category;
		this.price = price;
		this.ingri =ingri;
		this.name = name;
		
			
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
	
	public ArrayList<ingredient> ingri() {
		return ingri;
	}
	
	public String toString() {
        return name+':'+ category+','+'$'+price;
         
	}
	
	
	
	
	
	

}
