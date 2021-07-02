import java.util.*;

/*
 * Creates a ShapeContainer Object.
 * @author Melisa Tanrikulu
 * @version 02.07.2021
 */
public class ShapeContainer {
	
	// Instance Data Members
	private ArrayList<Shape> shapes;
	
	// Constructor
	
	/*
	 * Constructs the shape container.
	 */
	public ShapeContainer() {
		shapes = new ArrayList<Shape>();
	}
	
	/*
	 * Adds a shape to the list.
	 * @param shape
	 */
	public void add( Shape s ) {
		shapes.add(s);
	}
	
	/*
	 * Returns the total area of shapes in the list.
	 * @return area
	 */
	public double getArea() {
		// Variables
		double area;
		
		// Initialization
		area = 0;
		
		// Adds the areas of all shapes in the list
		for ( Shape shape : shapes )
			area += shape.getArea();
		
		return area;
	}
	
	/*
	 * Returns the total perimeter of shapes in the list.
	 * @return perimeter
	 */
	public double getPerimeter() {
		// Variables
		double perimeter;
		
		// Initialization
		perimeter = 0;
		
		// Adds the perimeters of all shapes in the list
		for ( Shape shape : shapes )
			perimeter += shape.getPerimeter();
		
		return perimeter;
	}
	
	/*
	 * Returns the string representation of the list.
	 * @return string
	 */
	public String toString() {
		// Variables
		String text;
		
		// Initialization
		text = "List of Shapes: \n";
		
		// Adds the all string representation of the shapes to one String
		for ( int count = 0; count < shapes.size(); count++) {
			text += ( count + 1 ) + ": " + shapes.get(count).toString();
		}

		// If the list is empty, shows it to the user
		if ( shapes.size() == 0)
			text += "No elements";
		
		return text;
	}
	
	/*
	 * Checks whether the point is in a shape in the list.
	 * @return the first shape that contains the point
	 */
	public Shape contains(int x, int y) {
		for ( Shape s : shapes ) {
			// If the point is in the shape, changes its selected status and returns it
			if ( s.contains(x, y) == s ) {
				s.setSelected( true );
				return s;
			}
		}
		
		return null;
	}
	/*
	 * Removes all the selected shapes from the list.
	 */
	public void remove() {
		// Variables
		Iterator<Shape> iterator = shapes.iterator();
		
		// Checks all the shapes in the lsit
		while ( iterator.hasNext() ) {
			Shape shape = iterator.next();
		    if ( shape.getSelected() == true ) {
		    	shapes.remove(shape);
		    	
		    // If there is no element in the list anymore, terminates the loop
		    if ( shapes.size() == 0 )
		    	break;
		    }	
		}
	}

}
