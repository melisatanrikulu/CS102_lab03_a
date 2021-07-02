/*
 * Creates a Triangle Object.
 * @author Melisa Tanrikulu
 * @version 30.06.2021
 */
public class Triangle extends Shape {
	
	// Instance Data Members
	int side_a;
	int side_b;
	int side_c;
	
	// Constructors
	
	/*
	 * Creates a triangle with given side lengths.
	 * @param first side
	 * @param second side
	 * @param third side
	 */
	public Triangle(int side_a, int side_b, int side_c) {
		this.side_a = side_a;
		this.side_b = side_b;
		this.side_c = side_c;
	}
	
	/*
	 * Returns the area of the triangle.
	 * @return area
	 */
	public double getArea() {
		// Variables
		double area;
		double semiPerimeter;
		
		semiPerimeter = getPerimeter() / 2;
		
		area = Math.sqrt( semiPerimeter * (semiPerimeter - side_a) * 
				(semiPerimeter - side_b) * (semiPerimeter - side_c) );
		
		return area;
	}
	
	/*
	 * Returns the perimeter of the triangle.
	 * @return perimeter
	 */
	public double getPerimeter() {
		// Variables
		double perimeter;
		
		perimeter = side_a + side_b + side_c;
		
		return perimeter;
	}
	
	/*
	 * Checks if the given point is in the triangle.
	 * @param x coordinate
	 * @param y coordinate
	 * @return the object if the point is in the triangle
	 */
	public Shape contains(int x, int y) {
		
		// First point's coordinates
		double firstPoint_xCo = getX();
		double firstPoint_yCo = getY();
		
		// Second point's coordinates
		double secondPoint_xCo = getX() + side_a;
		double secondPoint_yCo = getY();
		
		// Third point's coordinates
		double width = ( Math.pow(side_a, 2) + Math.pow(side_b, 2) - Math.pow(side_c, 2) ) / ( 2 * side_a );
		double height = Math.sqrt( Math.pow(side_b, 2) - Math.pow( width , 2) );
		
		double thirdPoint_xCo = getX() + width;
		double thirdPoint_yCo = getY() + height;
		
		// Areas of each triangles
		
		// Area between first point, second point and the given point
		double firstArea = ( firstPoint_xCo * ( secondPoint_yCo - y) + 
				secondPoint_xCo * ( y - firstPoint_yCo ) + x * ( firstPoint_yCo - secondPoint_yCo ) ) / 2;
		
		// Area between first point, given point and the third point
		double secondArea = ( firstPoint_xCo * ( y - thirdPoint_yCo) + 
				x * ( thirdPoint_yCo - firstPoint_yCo ) + thirdPoint_xCo * ( firstPoint_yCo - y ) ) / 2;
		
		// Area between given point, second point and the third point
		double thirdArea = ( x * ( secondPoint_yCo - thirdPoint_yCo ) + 
				secondPoint_xCo * ( thirdPoint_yCo - y ) + thirdPoint_xCo * ( y - secondPoint_yCo ) ) / 2;
		
		// Total area of the triangles
		double totalArea = firstArea + secondArea + thirdArea;
		
		// If the point is in the triangle, the sum of the triangles must be equal to the actual
		// area of the triangle.
		// In some cases where the point is not in the triangle, total area is equal to the
		// actual area but one of the areas is negative
		if ( totalArea == this.getArea() && firstArea >= 0 && secondArea >= 0 && thirdArea >= 0 ) 
			return this;
		
		return null;
	}
}
