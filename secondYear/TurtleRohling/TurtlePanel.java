package TurtleRohling;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.Point;

public class TurtlePanel extends Panel{
	Turtle kroete = null;

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		this.kroete = new Turtle(this);
		int laenge = 100;
		kroete.homePosition();
		kroete.dreheLinks(90);
		//kroete.drawYTree(15, laenge);  // ab 25 to much
		//kroete.drawBinTree(10, laenge);
		kroete.drawPythTree(g, new Point(600,100), new Point(800,100), new Point(800,250), new Point(600,250), 10);
	}
}
