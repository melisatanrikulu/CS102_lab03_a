import java.util.ArrayList;

public class ShapeContainer {
	
	private ArrayList<Shape> shapes;
	private ArrayList<Double> areas;
	private ArrayList<Double> perimeters;
	
	public ShapeContainer() {
		shapes = new ArrayList<Shape>();
	}
	
	public void add( Shape s ) {
		shapes.add(s);
	}
	
	public double getArea() {
		return 0;
	}
	
	public double getPerimeter() {
		return 0;
	}
	
	public String toString() {
		String text;
		String shapeName;
		double area;
		double perimeter;
		
		text = "";
		
		for ( Shape shape : shapes ) {
			shapeName = shape.getClass().getName();
			area = shape.getArea();
			perimeter = shape.getPerimeter();
			
			text += "Shape: " + shapeName + " Area: " + area + " Perimeter: " + perimeter + "\n";
		}
		
		return text;
	}

}
