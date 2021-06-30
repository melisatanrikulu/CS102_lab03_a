
public class Circle extends Shape{
	
	private int radius;
	private int xCoordinate;
	private int yCoordinate;
	
	public Circle(int radius) {
		this.radius = radius;
		this.xCoordinate = 0;
		this.yCoordinate = 0;
	}

	public double getArea() {
		double area;
		
		area = Math.PI * Math.pow(radius, 2);
		
		return area;
	}
	
	public double getPerimeter() {
		double perimeter;
		
		perimeter = 2 * Math.PI * radius;
		
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
