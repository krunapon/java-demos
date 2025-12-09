package coe.java.demos.c6;
import java.awt.Dimension;

import javax.swing.JFrame;
public class CoordinateAppDemo {
	public static void main(String[] args) {
		JFrame window = new JFrame("Coordinate Demo");
		CoordinateDemoPanel content =
			new CoordinateDemoPanel();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setContentPane(content);
		window.setLocation(100,75);
		window.setPreferredSize(new Dimension(500,200));
		window.pack();
		window.setVisible(true);
	}
}
