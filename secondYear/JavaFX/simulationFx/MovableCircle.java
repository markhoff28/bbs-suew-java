package simulationFx;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class MovableCircle extends Circle{
	private final MovementGenerator mG = new MovementGenerator();
	private double x = mG.position(), y = mG.position();
	private double dx = mG.velocity(), dy = mG.velocity();	   
	private final double radius; 

	   
	MovableCircle(double radius, Color color){
	       
		this.setCenterX(x);
	       
		this.setCenterY(y);
	       
		this.radius=radius;
	       this.setRadius(radius);
	       this.setFill(color);
	       setDx(dx);
	       setDy(dy);
	   } 

	    public double getDx() { return dx; }

	    public final void setDx(double newDx) {
	        while (newDx < -40 || newDx > 40) {
	            newDx = mG.velocity();
	        } 
	        dx = newDx;  
	    }

	    public double getDy() { return dy; }

	    public final void setDy(double newDy) {
	       while(newDy < -40 || newDy > 40) {
	            newDy = mG.velocity();
	        } 
	        dy = newDy;  
	    }

	    public void moveBall() {
	        // Check boundaries
	        if (x < radius || x > BounceBallControl.WIDTH - radius) {
	            dx *= -1; // Change ball move direction
	        }
	        if (y < radius || y > BounceBallControl.HEIGHT - radius) {
	            dy *= -1; // Change ball move direction   
	        }
	        // Adjust ball position
	        x += dx;
	        y += dy;
	        setCenterX(x);
	        setCenterY(y);
	    }

}
