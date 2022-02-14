package coe.java.demos.c6;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.geom.*;
public class ReadImage2 extends ReadImage {
	int h, w;
	Rectangle2D.Double rect;
	public ReadImage2() {
		super();
		w = img.getWidth();
		h = img.getHeight();
		rect = 
			new Rectangle2D.Double(0,0,w+20, h+80);
	}
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setPaint(Color.CYAN);
		g2d.fill(rect);
		g2d.drawImage(img, 10,10, null);
		g2d.setPaint(Color.BLACK);
		g2d.setFont(new Font("Serif", Font.BOLD,20));
		String msg = "Ta is reading a book with his grandma";
		g2d.drawString(msg,60, h+40);
		
	}
	public static void main(String[] args) {
		JFrame window = new JFrame("Read Image2 Demo");
		ReadImage2 content = new ReadImage2();
		window.setContentPane(content);
		content.setFrameFeatures(window);
	}
}
