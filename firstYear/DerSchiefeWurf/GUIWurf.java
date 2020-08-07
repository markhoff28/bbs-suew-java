package DerSchiefeWurf;
import javax.swing.*;
//import java.awt.*;

public class GUIWurf extends JFrame{
	public static void main(String[] args) {
		GUIWurf app = new GUIWurf();
		app.setDefaultCloseOperation(EXIT_ON_CLOSE);
		app.setSize(1500, 1500);
		app.setTitle("Der schiefe Wurf");
		
		//Einfügen d Panels
		FachWurf meinWurf = new FachWurf();
		meinWurf.setStart(45, 100, 100);
		app.add(meinWurf);
		app.setVisible(true);
	}// main end
	
}
