package coe.java.demos.c6;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HelloWorldGUI2 {
	private static class HelloWorldDisplay extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawString("Hello World!", 20, 30);
		}
	}

	private static class ButtonHandler 
			implements ActionListener {
		// the event object is e
		public void actionPerformed(ActionEvent e) {
			// response from the event handler
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		HelloWorldDisplay displayPanel = new HelloWorldDisplay();
		JButton okButton = new JButton("OK");
		// create a listener object
		ButtonHandler listener = new ButtonHandler();
		// register the listener object with 
		// the source object
		okButton.addActionListener(listener);
		JPanel content = new JPanel();
		content.setLayout(new BorderLayout());
		content.add(displayPanel, BorderLayout.CENTER);
		content.add(okButton, BorderLayout.SOUTH);
		JFrame window = new JFrame("GUI Test");
		window.setContentPane(content);
		window.setSize(250, 100);
		window.setLocation(100, 100);
		window.setVisible(true);
	}
}
