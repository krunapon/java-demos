package coe.java.demos.c6;
import javax.swing.JApplet;
import java.awt.Graphics;
public class HelloAppletWorld extends JApplet {
	public void paint(Graphics g) {
		g.drawRect(0,0,
				getSize().width - 1,
				getSize().height - 1);
		g.drawString("Hello", 5, 15);
	}
}
