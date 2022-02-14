package coe.java.demos.c7;
import java.awt.*;
import javax.swing.*;
public class ColorInitializerDemo extends  JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7742223057305550405L;
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		Color[] palette = {
	             Color.BLACK,
	             Color.RED,
	             Color.PINK,
	             new Color(0,180,0), // dark green
	             Color.GREEN,
	             Color.BLUE,
	             new Color(180,180,255), // light blue
	             Color.WHITE
	           };
		String[] colors = {"Black", "Red", 
				"Pink", "Dark green", "Green",
				"Blue", "Light blue", "White"
		};
		int numColors = palette.length;
		for (int i =0; i < numColors; i++) {
			g2d.setColor(palette[i]);
			// x = 20 y = i*30+10
			// width = 100 height = 30
			g2d.fillRect(20,i*30+10,100,30);
			if (palette[i] != Color.BLACK) {
				g2d.setColor(Color.BLACK);
			} else {
				g2d.setColor(Color.WHITE);
			}
			g2d.drawString(colors[i], 30, i*30+25);
		}
	}
	public static void main(String[] args) {
		ColorInitializerDemo cid
			= new ColorInitializerDemo();
		JFrame frame = new JFrame("Array of Colors");
		frame.setContentPane(cid);
		frame.setVisible(true);
		frame.setSize(150,300);
		frame.setLocation(100,100);
		frame.setDefaultCloseOperation(
				JFrame.EXIT_ON_CLOSE);
	
	}
}
