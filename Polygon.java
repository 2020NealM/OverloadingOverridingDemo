
public class Polygon {
	
	private int numberOfSides;
	
	public Polygon() {
		numberOfSides = 3;
	}
	
	public Polygon(int numSides) {
		numberOfSides = numSides;
	}
	
	public String toString() {
		return "polygon with " + numberOfSides + " sides";
	}

}
