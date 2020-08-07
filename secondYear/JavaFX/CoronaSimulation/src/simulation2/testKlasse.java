package simulation2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class testKlasse {
	// Config
		private static final int radius = 10;
		private static final int speed = 2;
		private static final double refreshSpeed = 50;
		private static final int totalPeople = 200;
		
		private static Boolean initialized = false;
		private static JFrame window = null;
		private static JPanel frame = null;
		private static Graphics graphics = null;
		private static ArrayList<Person> people;
		private static Timer thread = null;
		
		public static void main(String[] args) 
		{
		    window = new JFrame("Virus Simulator");
			window.setVisible(true);
			window.setSize(500,500);
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.setTitle("C O R O N A");
			window.setResizable(false);
			
			frame = new JPanel()
			{
				private static final long serialVersionUID = 1L;

				@Override
				public void paintComponent(Graphics g)
				{
					super.paintComponent(g);
					graphics = g;	
						
					if(!initialized)
					{				
						people = initPeople(graphics);
						paintPeople(graphics, people);
						initialized = true;
					}
					else
					{
						movePeople(graphics, people);
				    	paintPeople(graphics, people);				
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
			};
			
			window.add(frame);	
		}
		
		public static void paintPeople(Graphics g, ArrayList<Person> ppl)
		{	

			g.setColor(Color.RED);
			
			for(Person p: ppl)
			{
				g.fillOval(p.x, p.y, radius, radius);			
			}			
		}
		
		public static ArrayList<Person> initPeople(Graphics g)
		{	
			double h = window.getHeight();
			double w = window.getWidth();
			
			ArrayList<Person> result = new ArrayList<Person>();
			
			for(int i = 0; i < totalPeople; i++)
			{		
				int randomX = (int)((Math.random() * w) - 1) - radius;
				int randomY = (int)((Math.random() * h) - 1) - radius;
				
				int direction = (int)((Math.random() * 360) - 1);

				Person innocent = new Person(randomX, randomY, direction, false);
				result.add(innocent);
			}
				
			return result;
		}

		public static void movePeople(Graphics g, ArrayList<Person> ppl)
		{
			ArrayList<Person> temp = new ArrayList<Person>();
			
			for(Person p: ppl)
			{
				int newX = p.x + (int)(Math.cos(p.direction) * speed);
				int newY = p.y + (int)(Math.sin(p.direction) * speed);
				
				int newDirection = p.direction;
				
				Person newP = new Person(newX, newY, newDirection, p.infected);
				temp.add(newP);
			}
			
			people = temp;
		}
}
