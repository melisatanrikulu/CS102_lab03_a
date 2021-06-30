
public class Triangle extends Shape {
	
	int side_a;
	int side_b;
	int side_c;
	
	public Triangle(int side_a, int side_b, int side_c) {
		this.side_a = side_a;
		this.side_b = side_b;
		this.side_c = side_c;
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
}
