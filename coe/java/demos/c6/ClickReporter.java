package coe.java.demos.c6;
import java.applet.Applet;
import java.awt.*;
public class ClickReporter extends Applet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6334984198766202977L;

	public void init() {
		setBackground(Color.YELLOW);
		// source object = object in ClickReporter
		// event object = mouse pressed
		// listener object = new ClickListener()
		// register the applet to listen to
		// the listener object
		this.addMouseListener(new ClickListener());
	}
}
