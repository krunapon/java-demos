package coe.java.demos.c6;
import java.applet.Applet;
import java.awt.event.*;
import java.awt.*;
public class CircleDrawer2  extends Applet
	implements MouseListener {
	private int radius = 10;
	public void init() {
		addMouseListener(this);
	}
	public void mouseEntered(MouseEvent event) {}
	public void mouseExited(MouseEvent event) {}
	public void mouseReleased(MouseEvent event) {}
	public void mouseClicked(MouseEvent event) {}
	public void mousePressed(MouseEvent event) {
	  Graphics g = getGraphics();
	  g.setColor(Color.BLUE);
	  g.fillOval(event.getX()-radius,
	             event.getY()-radius,
	             2*radius,
	             2*radius);
	}

}
