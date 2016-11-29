package geometri;

import java.awt.Color;
import java.awt.Graphics;

public class Point extends GeometricalObject{
	
	/**
	 * Constructs a point with position (x,y) and a specified color
	 * @param x horizontal position
	 * @param y vertical position
	 * @param c color of the point
	 * @throws IllegalPositionException
	 */
	public Point(int x, int y, Color c) throws IllegalPositionException{
		
	}
	
	/**
	 * Constructs a point from a GeometricalForm and a specified color
	 * @param f GeometeicalForm to construct the circle from
	 * @param c color of the point
	 */
	public Point(GeometricalForm f, Color c){
		
	}
	
	
	/**
     * {@inheritDoc}
     */
    public  void fill(Graphics g){
    	
    }
    
   
    
    /**
     * {@inheritDoc}
     * The area of a piont is zero
     */
    public int getArea(){
    	
    }
    
    
    /**
     * {@inheritDoc}
     * The perimeter of a piont is zero
     */
    public int getPerimeter(){
    	
    }
    
   
    /**
     * {@inheritDoc}
     * A point is equal to another point if they are located at the same position and have the same color.
     */
    
   
}
