
public class Rectangle extends Shape{
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
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

}
