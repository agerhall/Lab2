package geometri;

import java.awt.Color;

public class Circle extends Oval{

	/**
	 * Constructs a circle with position (x,y) and with  specified diameter and color 
	 * @param x horizontal position
	 * @param y vertical position
	 * @param diameter diameter of the circle
	 * @param c color of the circle
	 * @throws IllegalPositionException
	 */
	public Circle(int x, int y, int diameter, Color c) throws IllegalPositionException{
		super(x, y, diameter, diameter, c);
	}
	
	
	/**
	 * Constructs a circle from a GeometricalForm and specified diameter and color
	 * @param f GeometeicalForm to construct the circle from
	 * @param diameter diameter of the circle
	 * @param c color of the circle
	 */
	public Circle(GeometricalForm f, int diameter, Color c){
		super(f, diameter, diameter, c);
	}

	

}