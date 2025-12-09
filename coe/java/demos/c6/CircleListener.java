package coe.java.demos.c6;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
// MouseAdapter implements MouseListener
public class CircleListener extends MouseAdapter {
	private int radius = 10;
	@Override
	public void mousePressed(MouseEvent event) {
		Applet app = (Applet) event.getSource();
		Graphics g = app.getGraphics();
		g.setColor(Color.BLUE);
		g.fillOval(event.getX() - radius,
				event.getY() - radius,
				2*radius,
				2*radius);
	}

}
