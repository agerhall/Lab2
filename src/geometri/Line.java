package geometri;

import java.awt.Color;
import java.awt.Graphics;

public class Line extends GeometricalObject{
	private boolean inclineIsPositive; // true if y1<y2
	
	
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
		 super(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x1-x2), Math.abs(y1-y2), c);
		 inclineIsPositive= 0<(x1-x2)*(y2-y1);
	 }
	 
	 /**
	  * 
	  * @param f1 GeometricalForm for start point
	  * @param f2 GeometricalForm for end point
	  * @param c color of the line
	  * @throws IllegalPositionException 
	  */
	 public Line(GeometricalForm f1, GeometricalForm f2, Color c) throws IllegalPositionException{
		 super(f1, Math.abs(f1.getX()-f2.getX()), Math.abs(f1.getY()-f2.getY()) , c);
		 place(Math.min(f1.getX(),f2.getX()), Math.min(f1.getY(),f2.getY()));
		 inclineIsPositive= 0<(f1.getX()-f2.getX())*(f2.getY()-f1.getY());
		 
	 }
	
	/**
     * {@inheritDoc}
     * The area of a line is 0
     */
	   public int getArea(){
		   return 0;
		   
	   }

	  

	    /**
	     * {@inheritDoc}
	     */
	   public void fill( Graphics g ){
		   g.setColor(super.getColor());
		   if(inclineIsPositive){
			   g.drawLine(super.getX(), super.getY()+super.getHeight(), super.getX()+super.getWidth(),super.getY());
		   }
		   else g.drawLine(super.getX(),super.getY(),super.getX()+super.getWidth(),super.getY()+super.getHeight());
	   }


	   /**
	     * {@inheritDoc}
	     * The perimeter of a line is the distance between the endpoints. 
	     */
	   public int getPerimeter(){
		   return (int) Math.round(Math.sqrt(super.getWidth()*super.getWidth()+super.getHeight()*super.getHeight()));
		   
	   }

	   
	   /**
	     * A line is equal to another line if they have the same perimeter 
	     * and the same incline
	     * {@inheritDoc}
	     * 
	     */
	   
	   public boolean equals(Object o){
		   return super.equals(o) && this.inclineIsPositive==((Line) o).inclineIsPositive;
		   
	   }
	  
	   public int hashCode(){
		   int a;
		   if(this.inclineIsPositive){
			   a=1;
		   }else{
			   a=-1;
		   }
		   return super.hashCode()*a;
		   
	   }
}
