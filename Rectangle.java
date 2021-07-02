/*
 * Creates a Rectangle Object.
 * @author Melisa Tanrikulu
 * @version 30.06.2021
 */
public class Rectangle extends Shape {
	
	// Instance Data Members
	private int width;
	private int height;
	
	// Constructors
	
	/*
	 * Creates a rectangle with given width and height.
	 * @param width
	 * @param height
	 */
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	/*
	 * Returns the area of the rectangle.
	 * @return area
	 */
	public double getArea() {
		// Variables
		double area;
		
		area = width * height;
		
		return area;
	}
	
	/*
	 * Returns the perimeter of the rectangle.
	 * @return perimeter
	 */
	public double getPerimeter() {
		// Variables
		double perimeter;
		
		perimeter = 2 * (width + height);
		
		return perimeter;
	}
	
	/*
	 * Checks if the given point is in the rectangle.
	 * @param x coordinate
	 * @param y coordinate
	 * @return the object if the point is in the rectangle
	 */
	public Shape contains(int x, int y) {
		// Set the location point as the left and upper point of rectangle. If x is between the location's 
		// x coordinate and to the point's width left, and y is between the location's y coordinate and
		// to the point's height down, then the point is in the rectangle.
		if ( getX() <= x && x <= getX() + width && getY() <= y && y <= getY() + height )
			return this;
		
		return null;
	}

}
