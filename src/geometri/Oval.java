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
		
	}
	
	/**
	 * Constructs a oval from a GeometricalForm and specified width, height and color
	 * @param f GeometeicalForm to construct the oval from
	 * @param width width of the oval
	 * @param height height of the oval
	 * @param c color of the oval
	 */
	public Oval(GeometricalForm f, int width, int height, Color c){
		
	}
	/**
     * {@inheritDoc}
     */
    public void fill(Graphics g){
    	
    }
    
    
    /**
     * {@inheritDoc}
     * The Area is calculated by pi*width*height
     */
    public int getArea(){
    	
    }
    
    
    
    /**
     * {@inheritDoc}
     * The perimeter of the oval is approximately pi*(3*width+height-sqrt(10width*height+3(width^2+height^2)))
     */
    public int getPerimeter(){
    	
    }
    
    /**
     * An oval is equal to another oval if they have the same width, heigth and color.
     * {@inheritDoc}
     * 
     */
    
  

}
