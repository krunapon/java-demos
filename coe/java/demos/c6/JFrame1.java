package coe.java.demos.c6;
import javax.swing.*;
public class JFrame1 {
	public static void main(String[] args) {
		JFrame window = new JFrame("GUI Test");
		// set size width = 200 pixels height = 400 
		window.setSize(250,100);
		// set location so that it appears
		// from the left side 200 pixels and 
		// from the top side 100 pixels
		window.setLocation(200,100);
		// make it visible by the users
		// make it appear on the screen
		window.setVisible(true);
	}
}
