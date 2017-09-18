/*
 * This is the superclass.
 * 
 * Notice the overloaded constructors.
 * 
 * Overloaded methods and constructors must have different numbers
 * and/or types of parameters so that the compiler knows which one
 * to execute.
 */
public class Polygon {
	
	private int numberOfSides;
	
	/*
	 * Constructor with no arguments.
	 */
	public Polygon() {
		numberOfSides = 3;
	}
	
	/*
	 * Constructor with one argument.
	 */
	public Polygon(int numSides) {
		numberOfSides = numSides;
	}
	
	public String toString() {
		return "polygon with " + numberOfSides + " sides";
	}

}
