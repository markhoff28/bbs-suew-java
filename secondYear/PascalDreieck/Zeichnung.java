package PascalDreieck;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Zeichnung extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	FachklasseDreick pascal = new FachklasseDreick();
	
	/**
	 * legt die fixpunkte der grafik fest
	 * stellt das dreieck grafisch dar
	 * 
	 */
	public void paint(Graphics g){
		int groesse = 2;
	//	int laenge = 50;
	//	int breite = 25;
		int mittex = getWidth() / 2 + groesse / 2;
		int posx = 0;
		int posy = 0;
		int max = 2;
		int verschieben = 0;
		
		
		for (int i=0; i<pascal.n; i++) {
			for (int x = 1; x < max ; x++){
				posx= mittex- (x*groesse);
				posy= (i*groesse);
				
				g.drawRect(posx - verschieben, posy, groesse, groesse);
				g.setColor(Color.gray);
				g.fillRect(posx - verschieben, posy, groesse, groesse);
				
				if ((pascal.feld[i][x -1] % 2) == 0){
					g.setColor(Color.green);
					g.fillRect(posx - verschieben, posy, groesse, groesse);		
				}
				if ((pascal.feld[i][x -1] % 2) == 1){
					g.setColor(Color.blue);
					g.fillRect(posx - verschieben, posy, groesse, groesse);					
				}
				if ((pascal.feld[i][x -1] % 3) == 0){
					g.setColor(Color.red);
					g.fillRect(posx - verschieben, posy, groesse, groesse);					
				}
				if ((pascal.feld[i][x -1] % 5) == 0){
					g.setColor(Color.cyan);
					g.fillRect(posx - verschieben, posy, groesse, groesse);					
				}
//				g.drawString(Integer.toString(pascal.feld[i][x -1]), posx - verschieben + groesse/5, posy + groesse/2);
		//g.drawString("1", mittex + 20, 70);
			}
			max++;
			verschieben -= groesse/2;
		}
		
	
	}//paint end
	
}
