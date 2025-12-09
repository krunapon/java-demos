package coe.java.demos.c6;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFirstRectangle extends JPanel {
	private GradientPaint gradient 
	= new GradientPaint(0,0, Color.GREEN, 200,200,
			Color.BLUE, false);
	private Rectangle2D.Double rect = 
		new Rectangle2D.Double(10,10,100,200);
	public MyFirstRectangle() {
		super();
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setPaint(gradient);
		g2d.fill(rect);
		g2d.setColor(Color.BLACK);
		g2d.draw(rect);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFirstRectangle mfr = new MyFirstRectangle();
		JFrame window = new JFrame("Rectangle");
		window.setContentPane(mfr);
		window.setVisible(true);
		window.setSize(150,250);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
