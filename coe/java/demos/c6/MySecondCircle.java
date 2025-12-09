package coe.java.demos.c6;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class MySecondCircle extends MyFirstCircle {
	private GradientPaint gradient 
	= new GradientPaint(0,0, Color.ORANGE, 30,30,
			Color.GREEN, true);
	private Ellipse2D.Double circle
	= new Ellipse2D.Double(10,10,100,100);
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setPaint(gradient);
		g2d.fill(circle);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySecondCircle mfc = new MySecondCircle();
		JFrame window = new JFrame("My Second Circle");
		mfc.setFrameFeatures(window);
	}

}
