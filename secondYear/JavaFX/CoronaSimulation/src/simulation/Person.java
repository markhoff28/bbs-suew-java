package simulation;

import java.awt.Graphics;
import java.util.ArrayList;

public class Person {
	
	public Person(int x, int y, int direction, Boolean status)
	{
		this.x = x;
	    this.y = y;
	    this.direction = direction;
	    this.infected = status;
	 }
	    
	public int x;
	public int y;
	public int direction;
	public Boolean infected;

}
