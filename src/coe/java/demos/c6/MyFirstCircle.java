package coe.java.demos.c6;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFirstCircle extends JPanel {
	public void paintComponent(Graphics g) {
		g.setColor(Color.ORANGE);
		g.fillOval(10,10, 100,100);
	}
	public void setFrameFeatures(JFrame window) {
		window.setContentPane(this);
		window.setVisible(true);
		window.setSize(150,150);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFirstCircle mfc = new MyFirstCircle();
		JFrame window = new JFrame("My First Circle");
		mfc.setFrameFeatures(window);
	}

}
