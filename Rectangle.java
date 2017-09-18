/*
 * This a subclass of Polygon.
 */
public class Rectangle extends Polygon {

	public Rectangle() {
		super(4);
	}
	
	/*
	 * Notice the overloaded area method.
	 */
	public double area(double length, double width) {
		return length * width;
	}
	
	public double area(double squareSideLength) {
		return squareSideLength * squareSideLength;
	}

	/*
	 * This toString method overrides the toString method of the
	 * superclass (Polygon).  The subclass method always takes
	 * precedence over the superclass method.
	 */
	public String toString() {
		return "rectangle";
	}
	
}
