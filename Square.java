
public class Square extends Shape {
	
	int side;
	
	public Square(int side) {
		this.side = side;
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

}
