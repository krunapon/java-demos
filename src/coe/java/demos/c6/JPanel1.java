package coe.java.demos.c6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JPanel1 {
	private static class HelloWorldDisplay extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawString("Hello World!", 20, 30);
		}
	}

	public static void main(String[] args) {
		HelloWorldDisplay hwd = new HelloWorldDisplay();
		hwd.setSize(100,100);
		hwd.setLocation(100,100);
		hwd.setVisible(true);
	}
}