package coe.java.demos.c6;
import javax.swing.JPanel;
import java.awt.*;
public class CoordinateDemoPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int width = getWidth();
		int height = getHeight();
		int w = width / 2;
		int h = height / 2;
		String msg = "hello students";
		// display the string with italic and bold
		// and also set the font size to be 32
		// set the font name to be SansSerif
		Font f = new Font("SansSerif", 
				Font.BOLD + Font.ITALIC, 32);
		g.setFont(f);
		g.setColor(Color.BLUE);
		g.drawString(msg, w, h);
		
	

	}
}
