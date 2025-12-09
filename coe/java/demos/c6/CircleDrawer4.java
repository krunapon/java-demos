package coe.java.demos.c6;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class CircleDrawer4 extends Applet {
	public void init() {
		setForeground(Color.BLUE);
		addMouseListener(new MouseAdapter() {
			private int radius = 10;

			public void mousePressed(MouseEvent event) {
				Graphics g = getGraphics();
				g.setColor(Color.BLUE);
				g.fillOval(event.getX() - radius, event.getY() - radius,
						2 * radius, 2 * radius);
			}
		});
	}
}
