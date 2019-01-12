import world.Plant;

/*
 * private - only within the same class
 * public - anywhere
 * protected - same class, subclass, and same package
 * no modifier - same package only
 * 
 */

public class App {
	public static void main(String[] args) {
		Plant plant = new Plant();
		
		System.out.println(plant.name);
		
		System.out.println(plant.ID);
		
		//Won't work because type is "private".
		//System.out.println(plant.type);
		
		//"Size" is protected and "App" is in a different package.
		//System.out.println(plant.size);
		
		//Won't work because "App" and "Plant" in different packages, height has package-level viability.
		//System.out.println(plant.height);
		
	}

}
