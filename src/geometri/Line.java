package geometri;

import java.awt.Color;
import java.awt.Graphics;

public class Line extends GeometricalObject{
	
	/**
	 * 
	 * @param x1 horizontal position of the start point
	 * @param y1 vertical position of the start point
	 * @param x2 horizontal position of the end point
	 * @param y2 vertical position of the end point
	 * @param c color of the line
	 * @throws IllegalPositionException
	 */
	 public Line(int x1, int y1, int x2, int y2, Color c) throws IllegalPositionException{
		 
	 }
	 /**
	  * 
	  * @param f1 GeometricalForm for startpoint
	  * @param f2 GeometricalForm for endpoint
	  * @param c color of the line
	  */
	 public Line(GeometricalForm f1, GeometricalForm f2, Color c){
		 
	 }
	
	/**
     * {@inheritDoc}
     * The area of a line is 0
     */
	   public int getArea(){
		   
	   }

	  

	    /**
	     * {@inheritDoc}
	     */
	   public void fill( Graphics g ){
		   
	   }


	   /**
	     * {@inheritDoc}
	     * The perimeter of a line is the distance between the endpoints. 
	     */
	   public int getPerimeter(){
		   
	   }

	   
	   /**
	     * A line is equal to another line if they have the same perimeter 
	     * and the same angle from the horizontal line.
	     * {@inheritDoc}
	     * 
	     */
	   
	   public boolean equals(Object o){
		   
	   }
	  
	   public int hashCode(){
		   
	   }
}
