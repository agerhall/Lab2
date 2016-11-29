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
		
		super(x,y,2,2,c);
		
	}
	
	/**
	 * Constructs a point from a GeometricalForm and a specified color
	 * @param f GeometeicalForm to construct the circle from
	 * @param c color of the point
	 */
	public Point(GeometricalForm f, Color c){
		super(f,2,2,c);
		
	}
	
	
	/**
     * {@inheritDoc}
     */
    public  void fill(Graphics g){
    	g.setColor(super.getColor());
    	g.fillOval(super.getX(), super.getY(), super.getWidth(), super.getHeight());
    	
    }
    
   
    
    /**
     * {@inheritDoc}
     * The area of a piont is zero
     */
    public int getArea(){
    	return 0;
    	
    }
    
    
    /**
     * {@inheritDoc}
     * The perimeter of a piont is zero
     */
    public int getPerimeter(){
    	return 0;
    }
    
   
   
   
}
