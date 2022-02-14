package coe.java.demos.c6;

import java.awt.*;
import javax.swing.*;

public class BorderLayoutDemo {
	public static void addComponents(Container cp) {
		cp.setLayout(new BorderLayout()); 
        cp.add(new Button("North"), BorderLayout.NORTH);
        cp.add(new Button("South"), BorderLayout.SOUTH);
        cp.add(new Button("East"), BorderLayout.EAST);
        cp.add(new Button("West"), BorderLayout.WEST);
        cp.add(new Button("Center"), BorderLayout.CENTER);

	}
	public static void main(String[] args) {
		JFrame frame = new JFrame("BorderLayoutDemo");
		addComponents(frame.getContentPane());
		//Display the window.
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		int width = dim.width;
		int height = dim.height;
		int w = frame.getSize().width;
		int h = frame.getSize().height;
		int x = (width - w)/2;
		int y = (height - h)/2;
        frame.pack();
        frame.setLocation(x,y);
        frame.setVisible(true);
	}
}
