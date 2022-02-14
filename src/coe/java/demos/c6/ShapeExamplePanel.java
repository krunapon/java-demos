package coe.java.demos.c6;
import javax.swing.*;  // For JPanel, etc.

import java.awt.*; // For Graphics, etc.
import java.awt.geom.*; // For Eliipse2D, etc.
public class ShapeExamplePanel extends JPanel {
	private Ellipse2D.Double circle = 
			new Ellipse2D.Double(10,10,200,200);
	private Rectangle2D.Double square = 
		new Rectangle2D.Double(50,50,100,100);
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.YELLOW);
		g2d.draw(circle);
		g2d.setColor(Color.BLUE);
		g2d.fill(square);
	}
	public Ellipse2D.Double getCircle() {
		return circle;
	}
	public void setFrameFeatures(JFrame window) {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocation(100,75);
		window.setSize(220,250);
		window.setVisible(true);
	}
	public static void main(String[] args) {
		JFrame window = new JFrame("Shape Demo");
		ShapeExamplePanel content =
			new ShapeExamplePanel();
		window.setContentPane(content);
		content.setFrameFeatures(window);
		
	}
}
