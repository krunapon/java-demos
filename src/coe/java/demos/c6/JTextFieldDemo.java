package coe.java.demos.c6;

import java.awt.*;
import javax.swing.*;
public class JTextFieldDemo {
	
	public static void addComponents(Container cp) {
		cp.setLayout(new FlowLayout());
		JLabel name = new JLabel("name:");
		JTextField nameInput = 
			new JTextField("Kanda ", 15);
		cp.add(name);
		cp.add(nameInput);
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("JTextFieldDemo");
		JPanel content = new JPanel();
		addComponents(content);
		JPanel buttonPane = new JPanel();
		buttonPane.add(new JButton("Submit"));
		frame.setLayout(new BorderLayout());
		frame.add(content, BorderLayout.NORTH);
		frame.add(buttonPane, 
				BorderLayout.AFTER_LAST_LINE);
		// Display the window.
		frame.pack();
		frame.setLocation(100, 100);
		frame.setVisible(true);
	}
}
