package world;

public class Oak extends Plant {
	
	public Oak() {
		//Won't work because type is "private".
		//type = "tree";
		
		//This works because "size" is protected and "oak" is a subclass of plant. 
		this.size = "large";
		
		//Works because "Oak" and "Plant" are in the same package
		this.height = 10;
		
	}

}
