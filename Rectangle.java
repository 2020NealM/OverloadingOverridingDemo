
public class Rectangle extends Polygon {

	public Rectangle() {
		super(4);
	}
	
	public double area(double length, double width) {
		return length * width;
	}
	
	public double area(double squareSideLength) {
		return squareSideLength * squareSideLength;
	}
	
	public String toString() {
		return "rectangle";
	}
	
}
