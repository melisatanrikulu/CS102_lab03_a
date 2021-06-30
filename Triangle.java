
public class Triangle extends Shape {
	
	int side_a;
	int side_b;
	int side_c;
	private int xCoordinate;
	private int yCoordinate;
	
	public Triangle(int side_a, int side_b, int side_c) {
		this.side_a = side_a;
		this.side_b = side_b;
		this.side_c = side_c;
		this.xCoordinate = 0;
		this.yCoordinate = 0;
	}
	
	public double getArea() {
		double area;
		double semiPerimeter;
		
		semiPerimeter = getPerimeter() / 2;
		
		area = Math.sqrt( semiPerimeter * (semiPerimeter - side_a) * 
				(semiPerimeter - side_b) * (semiPerimeter - side_c) );
		
		return area;
	}
	
	public double getPerimeter() {
		double perimeter;
		
		perimeter = side_a + side_b + side_c;
		
		return perimeter;
	}
	
	public double getX() {
		return xCoordinate;
	}
	
	public double getY() {
		return yCoordinate;
	}
	
	public void setLocation(int x, int y) {
		xCoordinate = x;
		yCoordinate = y;
	}
}
