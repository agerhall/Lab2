package geometri;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends GeometricalObject{
	
	/**
	 * Constructs a rectangle with position (x,y) and with specified with, height and color
	 * @param x horizontal position
	 * @param y vertical position
	 * @param width width of the rectangle
	 * @param height height of the rectangle
	 * @param c color of the rectangle
	 * @throws IllegalPositionException
	 */

	public Rectangle(int x, int y, int width, int height, Color c) throws IllegalPositionException{
		
		super(x,y,width,height,c);

	}
	
	/**
	 * Constructs a oval from a GeometricalForm and specified width, height and color
	 * @param f GeometeicalForm to construct the circle from
	 * @param width width of the rectangle
	 * @param height height of the rectangle
	 * @param c color of the rectangle
	 */
	public Rectangle(GeometricalForm f, int width, int height, Color c){
		super(f,width,height,c);

	}
	
	/**
     * {@inheritDoc}
     */

	public void fill(Graphics g){
		g.setColor(super.getColor());
		g.fillRect(super.getX(), super.getY(), super.getWidth(), super.getHeight());

	}


	/**
     * {@inheritDoc}
     */


	public  int getArea(){
		return super.getWidth()*super.getHeight();

	}
	
	/**
     * {@inheritDoc}
     */


	public  int getPerimeter(){
		return 2*(super.getWidth()+super.getHeight());

	}
	
	
}
