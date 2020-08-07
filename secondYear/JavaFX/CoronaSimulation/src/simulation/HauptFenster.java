package simulation;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class HauptFenster extends JFrame{
	
	public static void main(String[] args) {
		
		int breite = 500;
		int laege = 500;
		HauptFenster app = new HauptFenster();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SimPanel mysimulation = new SimPanel(breite, laege);
		app.setContentPane(mysimulation);
		app.pack();
		app.setVisible(true);
	}

}
