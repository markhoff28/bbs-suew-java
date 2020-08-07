package PascalDreieck;
import java.awt.BorderLayout;

import javax.swing.*;
import javax.swing.JSlider;

@SuppressWarnings("serial")
public class Fenster extends JFrame{

	Zeichnung draw = new Zeichnung();
	JSlider slid = new JSlider(JSlider.VERTICAL);

	/**
	 * erstellt das grafische fester
	 * legt die groesse gest
	 * initalisiert das dreieck
	 * strellt es dar
	 */
	public void erstelleFenster(){
		slid.setMinimum(2);
		slid.setMaximum(12);
		slid.setMajorTickSpacing(1);
		slid.createStandardLabels(1);
		slid.setPaintTicks(true);
		slid.setPaintLabels(true);
		slid.setValue(2);
		
		setBounds(100,100,1000,850);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(draw);
		add(slid, BorderLayout.WEST);
		setVisible(true);
	}

}
