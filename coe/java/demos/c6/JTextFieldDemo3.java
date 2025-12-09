package coe.java.demos.c6;

import java.awt.*;
import javax.swing.*;
public class JTextFieldDemo3 {
	public static void addComponents(Container cp) {
		cp.setLayout(new GridLayout(2,1));
		JLabel fname = new JLabel("Firstname:");
		JLabel lname = new JLabel("Lastname:");
		JTextField fnameInput = 
			new JTextField(15);
		JTextField lnameInput = 
			new JTextField(15);
		cp.add(fname);
		cp.add(fnameInput);
		cp.add(lname);
		cp.add(lnameInput);
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Simple Form");
		JPanel content = new JPanel();
		addComponents(content);
		JPanel buttonPane = new JPanel();
		buttonPane.add(new JButton("OK"));
		buttonPane.add(new JButton("Cancel"));
		frame.setLayout(new BorderLayout());
		frame.add(content, BorderLayout.NORTH);
		frame.add(buttonPane, 
				BorderLayout.SOUTH);
		// Display the window.
		frame.pack();
		frame.setLocation(100, 100);
		frame.setVisible(true);
	}
}
