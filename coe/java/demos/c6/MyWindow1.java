package coe.java.demos.c6;

import javax.swing.*;
import java.awt.*;
public class MyWindow1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int width = 300;
		int height = 100;
		int fromLeftSide = 100;
		int fromTopSide = 200;
		// top-level container
		JFrame window = new JFrame("My Window1");
		window.setTitle("My First Window");
		// intermediate container
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		
		// component
		JButton submitB = new JButton("Submit");
		// add component to the intermediate container
		panel.add(submitB);
		panel.add(new JButton("Cancel"));
		panel.add(new JButton("Reset"));
		// set the intermediate container of the top-level container
		window.setContentPane(panel);
		window.pack();
		window.setLocation(fromLeftSide, fromTopSide);
		window.setVisible(true);

	}

}
