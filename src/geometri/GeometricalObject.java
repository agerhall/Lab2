package geometri;
import java.awt.*;

public abstract class GeometricalObject implements GeometricalForm {
	private final int width;
	private final int height;
	private final Color c;
	private int x;
	private int y;

	/**
	 * Creates a geometrical object with a position (x,y), a width, a height, and a color.
	 *  @param x horizontal position
	 * @param y vertical position
	 * @param width width of the GeometricalObject
	 * @param height height of the GeometricalObject
	 * @param c color of the GeometricalObject
	 * @throws IllegalPositionException
	 */
	protected GeometricalObject(int x, int y, int width, int height, Color c) throws IllegalPositionException{

	}
	
	/**
	 * Creates a geometrical object with a position (x,y), a width, a height, and a color.
	 * @param GeometricalForm a form to construct the GeometricalObject
	 * @param width width of the GeometricalObject
	 * @param height height of the GeometricalObject
	 * @param c color of the GeometricalObject
	 * @throws IllegalPositionException
	 */
	protected GeometricalObject(GeometricalForm f, int width, int height, Color c) throws IllegalPositionException{

	}
	/**
	 * {@inheritDoc}
	 */

	public abstract void fill(Graphics g){

	}

	/**
	 * {@inheritDoc}
	 */
	public Color getColor(){

	}

	/**
	 * {@inheritDoc}
	 */
	public int compareTo(){

	}

	/**
	 * {@inheritDoc}
	 */
	public abstract int getArea(){

	}

	/**
	 * {@inheritDoc}
	 */
	public int getHeight(){

	}

	/**
	 * {@inheritDoc}
	 */
	public abstract int getPerimeter(){

	}

	/**
	 * 
	 * {@inheritDoc}
	 */
	public int getWidth(){

	}

	/**
	 * {@inheritDoc}
	 */
	public int getX(){

	}

	/**
	 * {@inheritDoc}
	 */
	public int getY(){

	}

	/**
	 * {@inheritDoc}
	 */
	public void move(int dx, int dy) throws IllegalPositionException{

	}

	/**
	 * {@inheritDoc}
	 */
	public void place(int x, int y) throws IllegalPositionException{

	}

	/**
	 * A GeometricalObject is equal to another GeometricalObject if they are of the same class and have the same width, heigth and color.
	 * {@inheritDoc}
	 * 
	 */

	public boolean equals(Object o){

	}
	/**
	 * {@inheritDoc}
	 */

	public int hashCode(){

	}



}
