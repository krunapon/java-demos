package coe.java.demos.c6;
import java.awt.event.*;
public class ClickListener extends MouseAdapter  {
	// handling method
	public void mousePressed(MouseEvent event) {
		System.out.println("Mouse pressed at(" +
				event.getX() + "," +
				event.getY() + ")");
	}
	public void mouseClicked(MouseEvent event) {
		System.out.println("Mouse clicked at(" +
				event.getX() + "," +
				event.getY() + ")");
	}
}
