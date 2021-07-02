/*
 * Creates a Selectable interface.
 * @author Melisa Tanrikulu
 * @version 30.06.2021
 */
public interface Selectable {
	/*
	 * Returns true if the object is selected.
	 * @return true if selected
	 */
	boolean getSelected();
	
	/*
	 * Changes the selected status.
	 * @param true if selected, false if not
	 */
	void setSelected(boolean selected);
	
	/*
	 * Checks whether the object contains a given x, y point, returns the shape
	 * if it contains the point.
	 * @param x coordinate
	 * @param y coordinate
	 * @return Shape
	 */
	Shape contains(int x, int y);
}
