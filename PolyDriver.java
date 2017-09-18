/*
 * Ths program demonstrates method/constructor overloading and
 * overriding.
 * 
 * Both overloading and overriding have to do with definning methods or
 * constructors with the same name.  In the case of overloading, the
 * methods are in the smae class.  In the case of overriding, the methods
 * are in super- and sub-classes.
 */
public class PolyDriver {

	public static void main(String[] args) {
		/*
		 * Create some shapes
		 */
		Polygon triangle = new Polygon();
		Polygon pentagon = new Polygon(5);
		Rectangle rect = new Rectangle();
		Rectangle square = new Rectangle();
		
		System.out.println("triangle is a " + triangle.toString());
		System.out.println("pentagon is a " + pentagon.toString() + "\n");
		
		System.out.println("rectangle is a " + rect.toString());
		System.out.println("square is a " + square.toString() + "\n");
		
		System.out.println("area of rectangle: " + rect.area(5.0, 6.0));
		System.out.println("area of square: " + square.area(12.0));
	}
}
