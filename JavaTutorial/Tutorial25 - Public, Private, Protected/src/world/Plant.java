package world;

public class Plant {
	//Bad practice
	public String name;
	
	//Acceptable practice because it's final.
	public final static int ID = 8;

	private String type;
	
	protected String size;
	
	int height;
	
	public Plant() {
		this.name = "Freddy";
		
		this.size = "medium";
		
		this.type = "plant";

		this.height = 8;
	}
}
