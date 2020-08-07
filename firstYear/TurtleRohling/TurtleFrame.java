package TurtleRohling;
import javax.swing.JFrame;

public class TurtleFrame extends JFrame{
	
	public static void main (String[] args) {
		TurtleFrame meineapp = new TurtleFrame();
		meineapp.setSize(1500,1000);
		meineapp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		meineapp.add(new TurtlePanel());
		meineapp.setVisible(true);
	}

}
