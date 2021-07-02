/*
 * Creates a Locatable interface.
 * @author Melisa Tanrikulu
 * @version 30.06.2021
 */
public interface Locatable {	
	/*
	 * Returns the x coordinate.
	 * @return x coordinate
	 */
	double getX();
	
	/*
	 * Returns the y coordinate.
	 * @return y coordinate
	 */
	double getY();
	
	/*
	 * Sets the location.
	 * @param x coordinate
	 * @param y coordinate
	 */
	void setLocation(int x, int y);
}
