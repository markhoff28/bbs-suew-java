package FXDigitaluhr;
import java.awt.BasicStroke;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DigitalClock extends JFrame{
	public DigitalClock() {
		super("DigitalClock");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		ClockPanel cp = new ClockPanel();
		cp.setPreferredSize(new Dimension(220, 50));
		add(cp);

		pack();
		setVisible(true);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new DigitalClock();
	}

	class ClockPanel extends JPanel {

		final int segmentLen = 10;

		final int segmentGap = 10;

		final int clockStartX = 10;

		final int clockStartY = 10;

		Timer clock = new Timer();

		Date date = new Date();
		
		/**
		 * Unsere 7-Segmentanzeige:
		 *        (6) 
		 *    ----------
		 *    |        |
		 * 0) |        |  (5) 
		 *    |   (4)  |
		 *    ----------
		 *    |        |
		 * (1)|        | (3)
		 *    |        |
		 *    ----------
		 *       (2)
		 */

		/**
		 * Über den Index (i) im segments byte[] finden wir Daten für die Darstellung der Ziffer des Indexes (i) in unserer 7 Segmentanzeige.
		 *                                           Segmente:  6 5 4 3 2 1 0                       
		 * segments[0] = 111 entspricht Darstellung Ziffer 0 -> 1 1 0 1 1 1 1
		 * -> Flag für Segment 4 ist nicht gesetzt -> Segment wird nicht gezeichnet.
		 * 
		 *        (6) 
		 *    ----------
		 *    |        |
		 * 0) |        |  (5) 
		 *    |        |
		 *    |        |
		 *    |        |
		 * (1)|        | (3)
		 *    |        |
		 *    ----------
		 *       (2)
		 * 
		 */
		byte[] segments = { (byte) 111, (byte) 40, (byte) 118, (byte) 124,
				(byte) 57, (byte) 93, (byte) 95, (byte) 104, (byte) 127,
				(byte) 125 };

		Stroke stroke = new BasicStroke(5.0F, BasicStroke.CAP_ROUND,
				BasicStroke.JOIN_MITER);

		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");

		TimerTask task = new TimerTask() {
			public void run() {
				date.setTime(System.currentTimeMillis());
				repaint();
			}
		};

		public ClockPanel() {
			clock.schedule(task, 0L, 1000L);
		}

		@Override
		protected void paintComponent(Graphics gr) {
			super.paintComponent(gr);
			Graphics2D g = (Graphics2D) gr;
			g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
					RenderingHints.VALUE_ANTIALIAS_ON);
			g.setStroke(stroke);
			drawTime(sdf.format(date), g);

		}

		public void drawTime(String string, Graphics2D g) {
			char[] c = string.toCharArray();
			for (int i = 0; i < c.length; i++) {
				int idx = c[i] - '0';
				byte value = idx == 10 ? 10 : segments[idx];
				drawSegments(value, i, g);
			}
		}

		public void drawSegments(byte b, int i, Graphics2D g) {
			int xPos = clockStartX + i * (clockStartX + segmentGap);
			int yPos = clockStartY;

			if (b == 10) {
				xPos += segmentLen / 2;
				yPos += segmentLen / 2;
				g.fillOval(xPos, yPos, 3, 3);
				g.fillOval(xPos, yPos + segmentLen / 2, 3, 3);
				return;
			}

			if (isBitSet(0, b)) {
				g.drawLine(xPos, yPos, xPos, yPos + segmentLen);
			}

			if (isBitSet(1, b)) {
				g
						.drawLine(xPos, yPos + segmentLen, xPos, yPos + 2
								* segmentLen);

			}

			if (isBitSet(2, b)) {
				g.drawLine(xPos, yPos + 2 * segmentLen, xPos + segmentLen, yPos
						+ 2 * segmentLen);
			}

			if (isBitSet(3, b)) {
				g.drawLine(xPos + segmentLen, yPos + 2 * segmentLen, xPos
						+ segmentLen, yPos + segmentLen);
			}

			if (isBitSet(4, b)) {
				g.drawLine(xPos + segmentLen, yPos + segmentLen, xPos, yPos
						+ segmentLen);
			}

			if (isBitSet(5, b)) {
				g.drawLine(xPos + segmentLen, yPos + segmentLen, xPos
						+ segmentLen, yPos);
			}

			if (isBitSet(6, b)) {
				g.drawLine(xPos + segmentLen, yPos, xPos, yPos);
			}
		}

		private boolean isBitSet(int i, byte b) {
			int pow = (byte) 1 << i;
			return (b & pow) == pow;
		}
	}
}
