/*
 * Creates a Square Object.
 * @author Melisa Tanrikulu
 * @version 30.06.2021
 */
public class Square extends Shape {
	
	// Instance Data Members
	int side;
	
	// Constructors
	
	/*
	 * Creates a square with given side length.
	 * @param side
	 */
	public Square(int side) {
		this.side = side;
	}
	
	/*
	 * Returns the area of the square.
	 * @return area
	 */
	public double getArea() {
		// Variables
		Rectangle square;
		double area;
		
		square = new Rectangle(side, side);
		area = square.getArea();
		
		return area;
	}
	
	/*
	 * Returns the perimeter of the square.
	 * @return perimeter
	 */
	public double getPerimeter() {
		// Variables
		double perimeter;
		
		perimeter = 4 * side;
		
		return perimeter;
	}
	
	/*
	 * Checks if the given point is in the square.
	 * @param x coordinate
	 * @param y coordinate
	 * @return the object if the point is in the square
	 */
	public Shape contains(int x, int y) {
		// Set the location point as the left and upper point of square. If x is between the location's 
		// x coordinate and to the point's side length left, and y is between the location's y coordinate and
		// to the point's side length down, then the point is in the square.
		if ( getX() <= x && x <= getX() + side && getY() <= y && y <= getY() + side )
			return this;
		
		return null;
	}

}
