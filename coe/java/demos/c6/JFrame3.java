package coe.java.demos.c6;
import javax.swing.*;
public class JFrame3 {
	public static void main(String[] args) {
		JFrame window = new JFrame("Hello GUI");
		// create the object panel for the content pane
		// of the window
		JPanel panel = new JPanel();
		// create the button as a UI component
		JButton button1 = new JButton("OK");
		JButton button2 = new JButton("Cancel");
		// add the button to the panel (content pane)
		panel.add(button1);
		panel.add(button2);
		// add the panel to the window
		window.add(panel);
		window.setSize(250,100);
		window.setLocation(100,100);
		window.setVisible(true);
	}
}
