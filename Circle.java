
public class Circle extends Shape{
	
	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
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
}
