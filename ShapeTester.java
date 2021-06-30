import java.util.ArrayList;
import java.util.Scanner;

public class ShapeTester {
	public static void main( String[] args ) {
		ShapeContainer shapes = new ShapeContainer();
		Shape shape;
		Scanner scan = new Scanner(System.in);
		int selection;
		int firstSide;
		int secondSide;
		int thirdSide;
		
		final int MENU_EXIT = 0;
		final int MENU_RECTANGLE = 1;
		final int MENU_CIRCLE = 2;
		final int MENU_SQUARE = 3;
		final int MENU_TRIANGLE = 4;
		final int MENU_PRINT_LIST = 5;
		
		
		do {
			System.out.println();
			System.out.println( MENU_RECTANGLE + " - Add Rectangle");
			System.out.println( MENU_CIRCLE + " - Add Circle");
			System.out.println( MENU_SQUARE + " - Add Square");
			System.out.println( MENU_TRIANGLE + " - Add Triangle");
			System.out.println( MENU_PRINT_LIST + " - Print List");
			
			System.out.println();
			System.out.print("Selection (" + MENU_EXIT + " to exit): ");
			selection = scan.nextInt();
			
			if ( selection == MENU_RECTANGLE ) {
				System.out.print("Enter first side: ");
				firstSide = scan.nextInt();
				System.out.print("Enter second side: ");
				secondSide = scan.nextInt();
				
				shape = new Rectangle(firstSide, secondSide);
				
				shapes.add(shape);
				
			}
			
			else if ( selection == MENU_CIRCLE ) {
				System.out.print("Enter radius: ");
				firstSide = scan.nextInt();
				
				shape = new Circle(firstSide);
				
				shapes.add(shape);
			}
			
			else if ( selection == MENU_SQUARE ) {
				System.out.print("Enter side: ");
				firstSide = scan.nextInt();
				
				shape = new Square(firstSide);
				
				shapes.add(shape);
			}
			
			else if ( selection == MENU_TRIANGLE ) {
				System.out.print("Enter first side: ");
				firstSide = scan.nextInt();
				System.out.print("Enter second side: ");
				secondSide = scan.nextInt();
				System.out.print("Enter third side: ");
				thirdSide = scan.nextInt();
				
				shape = new Triangle(firstSide, secondSide, thirdSide);
				
				shapes.add(shape);
			}
			
			else if ( selection == MENU_PRINT_LIST )
				System.out.println(shapes);
			
			else if ( selection != MENU_EXIT )
				System.out.println("Invalid selection! \n");

			
		}
		while ( selection != MENU_EXIT );
		
		scan.close();
	}
}