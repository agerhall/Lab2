package geometri;

import java.awt.Color;
import java.awt.Graphics;

public class Oval extends GeometricalObject{

	/**
	 * Constructs a oval with position (x,y) and with specified with, height and color
	 * @param x horizontal position
	 * @param y vertical position
	 * @param width width of the oval
	 * @param height height of the oval
	 * @param c color of the oval
	 * @throws IllegalPositionException
	 */
	public Oval(int x, int y, int width, int height, Color c) throws IllegalPositionException{
		super(x, y, width, height, c);
	}

	/**
	 * Constructs a oval from a GeometricalForm and specified width, height and color
	 * @param f GeometeicalForm to construct the oval from
	 * @param width width of the oval
	 * @param height height of the oval
	 * @param c color of the oval
	 */
	public Oval(GeometricalForm f, int width, int height, Color c) {
		super(f, width, height, c);
	}

	/**
	 * {@inheritDoc}
	 * The Area is calculated by pi*width*height
	 */
	public int getArea(){
		return (int)Math.round(super.getWidth()/2*super.getHeight()/2*Math.PI);
	}


	/**
	 * {@inheritDoc}
	 * Calculated with Ramanujan's approximation of the perimeter
	 */
	public int getPerimeter(){
		int a = super.getWidth();
		int b = super.getHeight();
		return (int)Math.round(Math.PI*(3*(a+b)-Math.sqrt((3*a+b)*(a+3*b)) ));
	}


	/**
	 * {@inheritDoc}
	 */
	public void fill(Graphics g){
		g.fillOval(super.getX(), super.getY(), super.getWidth(), super.getHeight());
	}



}