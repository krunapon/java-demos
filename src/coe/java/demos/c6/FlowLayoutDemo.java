package coe.java.demos.c6;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
public class FlowLayoutDemo {
	public static void addComponents(Container contentPane) {
		contentPane.setLayout(new FlowLayout());
        contentPane.add(new JButton("Button 1"));
        contentPane.add(new JButton("2"));
        contentPane.add(new JButton("This is button three"));
        contentPane.add(new JButton("four"));
	}
	public static void main(String[] args) {
		JFrame frame = new JFrame("FlowLayoutDemo");
		addComponents(frame.getContentPane());
		// frame.setSize(200,400);
		// adjust frame width and height
		// to fit and contains all components
		frame.pack();
        frame.setLocation(100,100);
        frame.setVisible(true);
	}
}
