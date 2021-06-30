
public class Rectangle extends Shape{
	private int width;
	private int height;
	private int xCoordinate;
	private int yCoordinate;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
		this.xCoordinate = 0;
		this.yCoordinate = 0;
	}
	
	public double getArea() {
		double area;
		
		area = width * height;
		
		return area;
	}
	
	public double getPerimeter() {
		double perimeter;
		
		perimeter = 2 * (width + height);
		
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
