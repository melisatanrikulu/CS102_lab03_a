/*
 * Creates a Circle Object.
 * @author Melisa Tanrikulu
 * @version 30.06.2021
 */
public class Circle extends Shape {
	
	// Instance Data Members
	private int radius;
	
	// Constructors
	
	/*
	 * Creates a circle with given radius.
	 * @param radius
	 */
	public Circle(int radius) {
		this.radius = radius;
	}

	/*
	 * Returns the area of the circle.
	 * @return area
	 */
	public double getArea() {
		// Variables
		double area;
		
		area = Math.PI * Math.pow(radius, 2);
		
		return area;
	}
	
	/*
	 * Returns the circumference of the circle.
	 * @return circumference
	 */
	public double getPerimeter() {
		// Variables
		double perimeter;
		
		perimeter = 2 * Math.PI * radius;
		
		return perimeter;
	}
	
	/*
	 * Checks if the given point is in the circle.
	 * @param x coordinate
	 * @param y coordinate
	 * @return the object if the point is in the circle
	 */
	public Shape contains(int x, int y) {
		// If the distance between the point and the center (the circle's location) is less than
		// or equal to radius, the point is in the circle
		if ( Math.sqrt( Math.pow(getX() - x, 2) + Math.pow(getY() - y, 2) ) <= radius )
			return this;
		
		return null;
	}
}
