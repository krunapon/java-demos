package coe.java.demos.c6;
import java.applet.Applet;
public class CircleDrawer1  extends Applet {
	public void init() {
		// register listener 
		// source object = Applet
		// listener object = new CircleListener()
		addMouseListener(new CircleListener());
	}
}
