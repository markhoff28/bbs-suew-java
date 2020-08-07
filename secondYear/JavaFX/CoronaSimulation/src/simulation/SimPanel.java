package simulation;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;

import simulation.Person;

public class SimPanel  extends JPanel {
	
	private JPanel frame = this;
	
	private int canvasWidth;
	private int canvasHight;
	private int totalPeople = 200;
	private int radius = 10;
	private int speed = 2;
	private double refreshSpeed = 50;
	private ArrayList<Person> people;
	private Timer thread = null;
	private boolean initialized = false;
	
	//Korrektur
	public SimPanel(int width, int heigth) {
		canvasWidth = width;
		canvasHight = heigth;
		
	}
	
	// Paint-Methode realisiert das Zeichnen
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, canvasWidth - 1, canvasHight - 1);
		if(!initialized)
		{				
			people = initPeople(g);
			paintPeople(g, people);
			initialized = true;
		}
		else
		{
			movePeople(g, people);
	    	paintPeople(g, people);				
		}
		
		if(thread == null)
		{
		    thread = new Timer();
		    thread.scheduleAtFixedRate(new TimerTask() 
		    {
				@Override
				public void run() 
				{
					frame.repaint();
				}
		    	
		    }, 0, (long) refreshSpeed);					    
		}
		
	}
	// wird vom Frame abgefragt 
	public Dimension getPreferredSize() {
		return (new Dimension(canvasWidth, canvasHight)); 
	}
	
	public void paintPeople(Graphics g, ArrayList<Person> ppl)
	{	

		g.setColor(Color.RED);
		
		for(Person p: ppl)
		{
			g.fillOval(p.x, p.y, radius, radius);			
		}			
	}
	
	public ArrayList<Person> initPeople(Graphics g) {	
		double h = (double)canvasHight - 1;
		double w = (double)canvasWidth - 1;
		
		ArrayList<Person> result = new ArrayList<Person>();
		
		for(int i = 0; i < totalPeople; i++) {		
			int randomX = (int)((Math.random() * w) - 1) - radius;
			int randomY = (int)((Math.random() * h) - 1) - radius;
			
			int direction = (int)((Math.random() * 360) - 1);

			Person innocent = new Person(randomX, randomY, direction, false);
			result.add(innocent);
		}
			
		return result;
	}

	public void movePeople(Graphics g, ArrayList<Person> ppl) {
		ArrayList<Person> temp = new ArrayList<Person>();
		
		for(Person p: ppl) {
			int newX = p.x + (int)(Math.cos(p.direction) * speed);
			int newY = p.y + (int)(Math.sin(p.direction) * speed);
			
			int newDirection = p.direction;
			
			Person newP = new Person(newX, newY, newDirection, p.infected);
			temp.add(newP);
		}
		
		people = temp;
	}
}
