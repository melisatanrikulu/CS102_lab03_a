import java.util.ArrayList;

public class ShapeContainer {
	
	private ArrayList<Shape> shapes;
	
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
		
		text = "";
		
		for ( Shape shape : shapes )
			text += shape.toString();
		
		return text;
	}
	
	public Shape contains(int x, int y) {
		for ( Shape s : shapes ) {
			if ( s.contains(x, y) == s ) {
				s.setSelected(true);
				return s;
			}
		}
		
		return null;
	}
	
	public void remove() {
		for ( Shape s : shapes )
			s.setSelected(false);
	}

}
