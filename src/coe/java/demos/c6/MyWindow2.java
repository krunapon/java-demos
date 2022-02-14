package coe.java.demos.c6;
import javax.swing.*;
import java.awt.*;
public class MyWindow2 {
	public static void addComponents(Container cp) {
		cp.setLayout(new BorderLayout());
		cp.add(new JButton("Submit"), BorderLayout.NORTH);
		cp.add(new JButton("Cancel"), BorderLayout.WEST);
		cp.add(new JButton("Reset"), BorderLayout.CENTER);
	}
	public static void main(String[] args) {
		JFrame window2 = 
			new JFrame("My Second Window");
		addComponents(window2.getContentPane());
		window2.pack();
		window2.setLocation(100,100);
		window2.setVisible(true);
	}
}
