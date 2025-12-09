package coe.java.demos.c6;

import java.awt.*;
import javax.swing.*;
public class GridLayoutDemo {
	public static void addComponents(Container cp) {
		cp.setLayout(new GridLayout(3,2)); 
        cp.add(new Button("Button 1"));
        cp.add(new Button("2"));
        cp.add(new Button(""));
        cp.add(new Button("This is button three"));
	}
	public static void main(String[] args) {
		JFrame frame = new JFrame("GridLayoutDemo");
		addComponents(frame.getContentPane());
		//Display the window.
        frame.pack();
        frame.setLocation(100,100);
        frame.setVisible(true);
	}
}
