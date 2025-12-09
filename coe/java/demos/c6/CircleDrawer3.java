package coe.java.demos.c6;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class CircleDrawer3 extends Applet  {
	public void init() {
		addMouseListener(new CircleListener());
	}

	private class CircleListener extends MouseAdapter {
		private int radius = 10;
		@Override
		public void mousePressed(MouseEvent event) {
			Graphics g = getGraphics();
			g.setColor(Color.BLUE);
			g.fillOval(event.getX() - radius, event.getY() - radius,
					2 * radius, 2 * radius);
		}
	}
}
