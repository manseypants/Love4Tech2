import world.Plant;

public class Grass extends Plant{
	public Grass() {
		
		//Won't work because "Grass" isn't in the same package as "Plant" even though it's a subclass.
		//System.out.println(this.height);
	}

}
