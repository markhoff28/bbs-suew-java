package DerSchiefeWurf;
import java.awt.*;
import java.awt.Graphics;
import java.text.DecimalFormat;


public class FachWurf extends Panel{
	DecimalFormat df = new DecimalFormat( "###,##0.000" ); 
	private double aw;     		//abwurfwinkel
	private double winkel; 		//abwurfwinkel neu
	private double ag;    		//abwurfgeschwindigkeit
	private double ah;     		//abwurfhoeehe
	private double g = 9.81;
	private double t = 0.0;  	//fulugzeit
	double streckex = 0;
	double streckey = 0;
	
	public void setStart(double winkel, double geschwindigkeit, double hoehe){
		aw = winkel;
		ag = geschwindigkeit;
		ah = hoehe;
	}//start end
	
	double getWinkel(){
		// winkel = (aw * Math.PI) / 180;
		winkel = Math.toRadians(aw); 
		return winkel;
	}//winkel
	
	double getStreckex(){
		
		return (ag * Math.cos(getWinkel()) * t);
	}//strecke end
	
	double getStreckey(){		
		return (ag * Math.sin(getWinkel()) * t) - ((g / 2) * Math.pow(t, 2)) + ah;
	}//strecke2 end
	
	public void berechnung(){
		
		System.out.println("Zeit    x-Koordinate    y-Koordinate"  );
		System.out.println("____________________________________________");
		System.out.println("____________________________________________");
		while (getStreckey() >= 0 && getStreckey() <= 1500){
			streckex = getStreckex();
			streckey = getStreckey();
			System.out.println(df.format(t) + "\t" + df.format(streckex) + " \t" + df.format(streckey));
			t = t + 0.01;
			
		}//while den
		System.out.println("____________________________________________");
	}//berechnung() end
	
	public void resetValue() {
		streckex = 0;
		streckey = aw;
		t = 0;
	}
	public void paint(Graphics g) {
		/* double streckex = 0;
		 double streckey = 0;*/
		super.paint(g);
		resetValue();		//g.drawRect(10, 10, 100, 100);
		while (streckey >= 0){
			streckex = getStreckex();
			streckey = getStreckey();
			System.out.println(df.format(t) + "\t" + df.format(streckex) + " \t" + df.format(streckey));
			g.drawRect((int)streckex + 20, (int)(streckey *-1) + 1000, 1, 1);
			t = t + 0.01;
			
		}//while den
		g.drawLine(20, 0, 20, 1500);
		g.drawLine(0, 1000, 1500, 1000);
	}
}
