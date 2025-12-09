package coe.java.demos.c6;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class SimpleApplet extends Applet {

	StringBuffer buffer;

	public void init() {
		buffer = new StringBuffer();
		addItem("initializing...");
	}

	public void start() {
		addItem("starting...");
	}

	public void stop() {
		addItem("stopping...");
	}

	public void destroy() {
		addItem("preparing to unload...");
	}

	public void addItem(String newWord) {
		System.out.println(newWord);
		buffer.append(newWord);
		repaint();
	}

	public void paint(Graphics g) {
		g.drawRect(0, 0, getSize().width - 1, getSize().height - 1);
		g.drawString(buffer.toString(), 15, 25);
	}
}
