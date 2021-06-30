
public abstract class Shape implements Locatable, Selectable {
	private int xCoordinate;
	private int yCoordinate;
	private boolean selected;
	
	public Shape() {
		xCoordinate = 0;
		yCoordinate = 0;
		selected = false;
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();
	
	public double getX() {
		return xCoordinate;
	}
	
	public double getY() {
		return yCoordinate;
	}
	
	public void setLocation(int x, int y) {
		xCoordinate = x;
		yCoordinate = y;
	}
	
	public boolean getSelected() {
		return selected;
	}
	
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	public Shape contains(int x, int y) {
		if ( xCoordinate == x && yCoordinate == y)
			return this;
		else
			return null;
	}
	
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
