import java.util.Scanner;

/*
 * A menu for shape.
 * @author Melisa Tanrikulu
 * @version 01.07.2021
 */
public class ShapeTester {
	public static void main( String[] args ) {
		
		// Variables
		ShapeContainer shapes = new ShapeContainer();
		Scanner scan = new Scanner(System.in);
		Shape shape;		
		int selection;
		int firstSide;
		int secondSide;
		int thirdSide;
		int xCoordinate;
		int yCoordinate;
		
		// Constants
		final int MENU_EXIT = 0;
		final int MENU_EMPTY = 1;
		final int MENU_RECTANGLE = 2;
		final int MENU_CIRCLE = 3;
		final int MENU_SQUARE = 4;
		final int MENU_TRIANGLE = 5;
		final int MENU_AREA = 6;
		final int MENU_PERIMETER = 7;
		final int MENU_PRINT_LIST = 8;
		final int MENU_CONTAINS = 9;
		final int MENU_REMOVE = 10;
		
		// Menu
		do {
			System.out.println();
			System.out.println( MENU_EMPTY + " - Create an empty set");
			System.out.println( MENU_RECTANGLE + " - Add Rectangle");
			System.out.println( MENU_CIRCLE + " - Add Circle");
			System.out.println( MENU_SQUARE + " - Add Square");
			System.out.println( MENU_TRIANGLE + " - Add Triangle");
			System.out.println( MENU_AREA + " - Total surface area of the entire set");
			System.out.println( MENU_PERIMETER + " - Total perimeter of the entire set");
			System.out.println( MENU_PRINT_LIST + " - Print List");
			System.out.println( MENU_CONTAINS + " - Find the first shape that contains (x, y)");
			System.out.println( MENU_REMOVE + " - Remove all selected shapes");
			
			System.out.println();
			System.out.print("Selection (" + MENU_EXIT + " to exit): ");
			
			// Gets the selection
			selection = scan.nextInt();
			
			// Creates an empty set of shapes
			if ( selection == MENU_EMPTY ) {
				shapes = new ShapeContainer();
				System.out.println("Empty set of shapes is created.");
			}
			
			// Adds a rectangle to the list
			else if ( selection == MENU_RECTANGLE ) {
				System.out.print("Enter first side: ");
				firstSide = scan.nextInt();
				System.out.print("Enter second side: ");
				secondSide = scan.nextInt();
				
				// Creates the rectangle and adds it to the list
				shape = new Rectangle(firstSide, secondSide);
				shapes.add(shape);
				
				System.out.println("The triangle is added.");
				
			}
			
			// Adds a circle to the list
			else if ( selection == MENU_CIRCLE ) {
				System.out.print("Enter radius: ");
				firstSide = scan.nextInt();
				
				// Creates the circle and adds it to the list
				shape = new Circle(firstSide);
				shapes.add(shape);
				
				System.out.println("The circle is added.");
			}
			
			// Adds a square to the list
			else if ( selection == MENU_SQUARE ) {
				System.out.print("Enter side: ");
				firstSide = scan.nextInt();
				
				// Creates the square and adds it to the list
				shape = new Square(firstSide);
				shapes.add(shape);
				
				System.out.println("The square is added.");
			}
			
			// Adds a triangle to the list
			else if ( selection == MENU_TRIANGLE ) {
				System.out.print("Enter first side: ");
				firstSide = scan.nextInt();
				System.out.print("Enter second side: ");
				secondSide = scan.nextInt();
				System.out.print("Enter third side: ");
				thirdSide = scan.nextInt();
				
				// Creates the triangle and adds it to the list
				shape = new Triangle(firstSide, secondSide, thirdSide);
				shapes.add(shape);
				
				System.out.println("The triangle is added.");
			}
			
			// Prints the total surface area of the entire set
			else if ( selection == MENU_AREA ) {
				double area;
				
				// Total area
				area = shapes.getArea();
				
				System.out.println("Total surface area of the entire set: " + area);
			}
			
			// Prints the total perimeter area of the entire set
			else if ( selection == MENU_PERIMETER ) {
				double perimeter;
				
				// Total perimeter
				perimeter = shapes.getPerimeter();
				
				System.out.println("Total perimeter of the entire set: " + perimeter);
			}
			
			// Prints the entire list
			else if ( selection == MENU_PRINT_LIST )
				System.out.println(shapes);
			
			// Finds the first shape that contains (x, y)
			else if ( selection == MENU_CONTAINS ) {
				System.out.print("Enter x coordinate: ");
				xCoordinate = scan.nextInt();
				System.out.print("Enter y coordinate: ");
				yCoordinate = scan.nextInt();
				
				// Checks if any shape contains the point
				Shape s = shapes.contains(xCoordinate, yCoordinate);
				
				// If a shape contains the point, prints the shape
				if ( s != null ) 
					System.out.println(s);
				
				// Otherwise, informs the user
				else
					System.out.println("No shape in the list contains the point (" + xCoordinate + ", " + yCoordinate + ")");
				
			}
			
			// Removes all shapes that are selected from the list
			else if ( selection == MENU_REMOVE ) {
				shapes.remove();
				
				System.out.println("All selected shapes are removed.");
			}
			
			// If invalid selection is entered, informs the user
			else if ( selection != MENU_EXIT )
				System.out.println("Invalid selection! \n");
			
		}
		while ( selection != MENU_EXIT );
		
		// Informs the user that menu is exited
		System.out.println( "\nEnd of ShapeTester"); 
		
		scan.close();
	}
}
