package FXDigitaluhr;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;
import javax.swing.Timer;

public class Uhrzeit extends JPanel{
	GregorianCalendar gc = new GregorianCalendar();
	  
  	Timer timer = new Timer(1000, new ActionListener() 
  	{
 		 public void actionPerformed(ActionEvent evt) { repaint(); }	
  	});
  	
  	public void start()	{ timer.start(); }
  	
  	public void paintComponent(Graphics g)
  	{
  		super.paintComponent(g);
  		g.drawRect(10,10,280,140);
  		g.drawString(gc.getTime().toString(),50,100);
  		gc.setTime(new Date());
  	}
  	
  	public static void main(String [] args)
  	{
  		JFrame frame = new JFrame("Uhrzeit");
  		Uhr gr = new Uhr();
  		frame.getContentPane().add(gr);
  		gr.setPreferredSize(new Dimension(300,160));
  		frame.pack();
  		frame.setVisible(true);
  		gr.start();
  	}
}
