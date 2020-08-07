package FXDigitaluhr;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Uhr extends JPanel{
	Timer timer = new Timer(1000, new ActionListener() {
	 	public void actionPerformed(ActionEvent evt) {
	 		repaint();
	 	}	
	 	});
	 	int zaehler = 0;
	 	public void start()
	 	{
	 		timer.start();
	 	}
	 	public void paintComponent(Graphics g)
	 	{
	 		super.paintComponent(g);
	 		g.drawRect(10,10,280,140);
	 		g.drawString(zaehler + " ",50,100);
	 		zaehler++;
	 	}
	 	public static void main(String [] args)
	 	{
	 		JFrame frame = new JFrame("Uhr");
	 		Uhr gr = new Uhr();
	 		frame.getContentPane().add(gr);
	 		gr.setPreferredSize(new Dimension(300,160));
	 		frame.pack();
	 		frame.setVisible(true);
	 		gr.start();
	 	}
}
