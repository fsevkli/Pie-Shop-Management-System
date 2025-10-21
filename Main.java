import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
	//pie p = new pie("Apple Pie", "Fruit Pie", 5.00);
	
	fruit i = new fruit("Milk", 2.0, "L");
	ArrayList<ingredient> ingri = new ArrayList<ingredient>();
	ingri.add(i);
	FruitP p = new FruitP("sugary", " 6/10", "Apple Pie", 3.0, ingri);
	p.toString();
	
	
	
		
		
	
 }
}
