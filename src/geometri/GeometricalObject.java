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
	 * @param x horizontal position
	 * @param y vertical position
	 * @param width width of the GeometricalForm
	 * @param height height of the GeometricalForm
	 * @param c color of the GeometricalForm
	 * @throws IllegalPositionException
	 */
	protected GeometricalObject(int x, int y, int width, int height, Color c) throws IllegalPositionException{
		if(x<0 || y<0){throw new IllegalPositionException();}
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.c = c;
	}

	protected GeometricalObject(GeometricalForm f, int width, int height, Color c){
		this.x = f.getX();
		this.y = f.getY();
		this.width = width;
		this.height = height;
		this.c = c;
	}

	/**
	 * {@inheritDoc}
	 */
	public int getX(){
		return this.x;
	}


	/**
	 * {@inheritDoc}
	 */
	public int getY(){
		return this.y;
	}


	/**
	 * 
	 * {@inheritDoc}
	 */
	public int getWidth(){
		return this.width;
	}


	/**
	 * {@inheritDoc}
	 */
	public int getHeight(){
		return this.height;
	}


	/**
	 * {@inheritDoc}
	 */
	public Color getColor(){
		return c;
	}


	/**
	 * {@inheritDoc}
	 */
	public abstract int getArea();


	/**
	 * {@inheritDoc}
	 */
	public abstract int getPerimeter();


	/**
	 * {@inheritDoc}
	 */
	public void move(int dx, int dy) throws IllegalPositionException{
		if((x + dx)<0 || (y+dy)<0){throw new IllegalPositionException();}
		x = x + dx;
		y = y + dy;
	}


	/**
	 * {@inheritDoc}
	 */
	public void place(int x, int y) throws IllegalPositionException{
		if(x<0 || y<0){throw new IllegalPositionException();}
		this.x=x;
		this.y=y;

	}


	/**
	 * {@inheritDoc}
	 */
	public abstract void fill(Graphics g);


	/**
	 * A GeometricalObject is equal to another GeometricalObject if they are of the same class and have the same width, heigth and color.
	 * {@inheritDoc}
	 * 
	 */
	public boolean equals(Object o){
		return(o.getClass().equals(this.getClass())  && this.width==((GeometricalObject) o).getWidth()&&this.height==((GeometricalObject) o).getHeight());

	}


	/**
	 * {@inheritDoc}
	 */
	public int compareTo(GeometricalForm f){
		if (getArea() - f.getArea() == 0){
			return getPerimeter() - f.getPerimeter();
		}
		else return getArea() - f.getArea();
	}


	/**
	 * {@inheritDoc}
	 */
	public int hashCode(){
		return width*7+height*this.getClass().hashCode();

	}

}