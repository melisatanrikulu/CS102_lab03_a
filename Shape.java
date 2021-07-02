/*
 * Creates a Shape Object.
 * @author Melisa Tanrikulu
 * @version 02.06.2021
 */
public abstract class Shape implements Locatable, Selectable {
	
	// Instance Data Members
	private int xCoordinate;
	private int yCoordinate;
	private boolean selected;
	
	// Constructor
	
	/*
	 * Creates a shape.
	 */
	public Shape() {
		xCoordinate = 0;
		yCoordinate = 0;
		selected = false;
	}
	
	/*
	 * Returns the area of the shape.
	 * @return area
	 */
	public abstract double getArea();
	
	/*
	 * Returns the perimeter of the shape.
	 * @return perimeter
	 */
	public abstract double getPerimeter();
	
	/*
	 * Returns the x coordinate.
	 * @return x coordinate
	 */
	public double getX() {
		return xCoordinate;
	}
	
	/*
	 * Returns the y coordinate.
	 * @return y coordinate
	 */
	public double getY() {
		return yCoordinate;
	}
	
	/*
	 * Changes the shape's location.
	 * @param new x coordinate
	 * @param new y coordinate
	 */
	public void setLocation(int x, int y) {
		xCoordinate = x;
		yCoordinate = y;
	}
	
	/*
	 * Return the selected status.
	 * @return selected status
	 */
	public boolean getSelected() {
		return selected;
	}
	
	/*
	 * Changes the selected status.
	 * @param new selected status
	 */
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	/*
	 * Checks whether the point is in the shape or not.
	 * @return false if the point is not in the shape
	 */
	public abstract Shape contains(int x, int y);
	
	/*
	 * Return the string representation of the shape.
	 * @return text
	 */
	public String toString() {
		String text;
		String shapeName = this.getClass().getName();
		double area = this.getArea();
		double perimeter = this.getPerimeter();
		boolean selected = this.getSelected();
		
		text = "Shape: " + shapeName + " Area: " + area + " Perimeter: " + perimeter + " Selected: " + selected + "\n";
		return text;
	}
}
