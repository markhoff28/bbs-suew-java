package TurtleRohling;
import java.awt.*;

class Turtle {
	  protected double posX, posY;        // Aktuelle Position der Turtle
	  protected double winkel;            // Aktueller Blickwinkel
	  protected Color farbe=Color.black;  // Standard-Zeichenfarbe
	  protected Container c;			  // Der Zeichencontainer
	  protected double homeX, homeY;      // Home-Koordinaten
	  protected boolean stiftUnten;
	  protected int breiteX, hoeheY;
	  protected Graphics g;

	  public Turtle(Container cont)
	  {
		    winkel=0;
		    stiftUnten = true;

		    c=cont;					// merken des Containers
		    g=cont.getGraphics();	// und des GrafikObjektes
		    breiteX = c.getBounds().width;
		    hoeheY = c.getBounds().height;
		    posX = breiteX / 2;
		    posY = hoeheY;		// positioniert die Turtle in die linke untere Ecke
		    homeX = posX;
		    homeY = posY;




	  }

	  public void homePosition()
	  {
	    posX=homeX;
	    posY=homeY;
	    winkel=0;
	  }

	  public void bewege(double laenge)
	  {
	    g.setColor(farbe);
	    double neuX = posX + Math.cos(bogen(winkel))*laenge;
	    double neuY;
	    neuY = posY - Math.sin(bogen(winkel))*laenge;
	    if (stiftUnten) g.drawLine((int) posX, (int) posY, (int) neuX, (int) neuY);

	    posX = neuX;
	    posY = neuY;
	  }

	  public void dreheLinks(double grad)
	  {
	    winkel = winkel + grad;
	    //   if (winkel > 360) winkel = winkel -360;
	  }

	  public void dreheRechts(double grad)
	  {
	    winkel = winkel - grad;
	    //	if (winkel<0) winkel = 360+winkel ;

	  }

	  public void back(int laenge){
		  dreheLinks(180);
		  stiftHoch();
		  bewege(laenge);
		  dreheRechts(180);
		  stiftRunter();
	  }


	  public void loesche()
	  {
		homePosition();

	    int x=c.getBounds().width;
	    int y=c.getBounds().height;
	    g.clearRect(0, 0, x, y);
	  }

	  public void setFarbe(Color c)
	  {
	    farbe = c;
	  }

	  public void stiftHoch()
	  {
	    stiftUnten=false;
	  }

	  public void stiftRunter()
	  {
	    stiftUnten=true;
	  }


	  public void zeichneNormal()
	  {
	    g.setPaintMode();
	  }

	  private double bogen(double winkel)
	  {
	    return winkel*Math.PI/180;
	  }
	  public void back(double laenge)
	  {
		  dreheLinks(180);
		  stiftHoch();
		  bewege(laenge);
		  dreheRechts(180);
		  stiftRunter();
	  }

	  public void drawYTree(int ordnung, double laenge)
	  {
		 bewege(laenge);
		 if (ordnung > 0)
		 {
			 dreheLinks(25);
			 drawYTree(ordnung - 1, laenge * 0.8);
			 dreheRechts(25 * 2);
			 drawYTree(ordnung - 1, laenge * 0.8);
			 dreheLinks(25);
		 }
		 back(laenge);
	  }

	  public void drawBinTree(int ordnung, double laenge)
		{
			double horizontal = laenge * 0.8;
			double vertikal = laenge * 3;
			bewege(vertikal);
			dreheRechts(90);
			bewege(horizontal);
			back(horizontal);
			dreheRechts(180);
			bewege(horizontal);
			//---------------------------------------------------
			if (ordnung > 0)
			{
				// zeichnet die linke haelfte 
				dreheRechts(90);
				drawBinTree(ordnung - 1, laenge * 0.485);
				//------------------------------------------
				// zeichnet die rechte haelfte
				dreheRechts(90);
				bewege(horizontal * 2);
				dreheLinks(90);
				drawBinTree(ordnung - 1, laenge * 0.485);
				dreheLinks(90);
				bewege(horizontal);
				dreheLinks(90);
				bewege(vertikal);
				dreheLinks(180);
			}
				else if (ordnung == 0) {
					dreheRechts(90);
					bewege(vertikal);
					//------------------
					back(vertikal); 
					dreheLinks(90);
					back(horizontal * 2);
					dreheRechts(90);
					bewege(vertikal);	
					// gehe zurueck zum anfang
					back(vertikal);
					dreheRechts(90);
					back(horizontal);
					dreheLinks(90);
					back(vertikal);
			}
			
			//back(laenge);
		}
		
		public void drawRectangle(int ordnung, double laenge)
		{
			
		}
		
		public void drawPythTree(Graphics g2, Point a, Point b, Point c, Point d, int depth) 
		{

	        // a,b,c,d sind die Punkte des jeweiligen Quadrats (gegen den Uhrzeigersinn)
			Point a1,b1,c1,d1, a2,b2,c2,d2;

	        if (depth==0) return; // Astende erreicht
	        depth -= 1;

	        // Quadrat-Koordinaten bestimmen und zeichnen
	        int xCoords[] = {a.x, b.x, c.x, d.x};
	        int yCoords[] = {980-a.y, 980-b.y, 980-c.y, 980-d.y};

	        g2.setColor(new Color(150-5*depth,150-5*depth,50)); // Baumfarbe variieren
	        g2.drawPolygon(xCoords, yCoords, 4);

	        // Neuen Basispunkt e fuer a oder b des nächsten Quadrats bestimmen
	        double r1 = 0.2 + Math.random()*0.6; // Damit jeder Baum anders aussieht
	        double r2 = Math.sqrt(0.5*0.5-(0.5-r1)*(0.5-r1)); // Satz des Pythagoras
	        Point e = new Point((int)(d.x + r1*(c.x-d.x) + r2*(a.y-b.y)),
			(int)(d.y + r1*(c.y-d.y) + r2*(b.x-a.x)));

	        // Neues Quadrat links
	        a1 = d;
	        b1 = e;
	        c1 = new Point(b1.x+a1.y-b1.y, b1.y+b1.x-a1.x);
	        d1 = new Point(a1.x+a1.y-b1.y, a1.y+b1.x-a1.x);
	        drawPythTree(g2, a1, b1, c1, d1, depth);

	        // Neues Quadrat rechts
	        a2 = e;
	        b2 = c;
	        c2 = new Point(b2.x+a2.y-b2.y, b2.y+b2.x-a2.x);
	        d2 = new Point(a2.x+a2.y-b2.y, a2.y+b2.x-a2.x);
	        drawPythTree(g2, a2, b2, c2, d2, depth);
	    }
}
