
public class Square extends Shape {
	
	int side;
	private int xCoordinate;
	private int yCoordinate;
	
	public Square(int side) {
		this.side = side;
		this.xCoordinate = 0;
		this.yCoordinate = 0;
	}
	
	public double getArea() {
		Rectangle square = new Rectangle( side, side);
		double area;
		
		area = square.getArea();
		
		return area;
	}
	
	public double getPerimeter() {
		double perimeter;
		
		perimeter = 4 * side;
		
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
