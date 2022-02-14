/*
 * Written by 
 * ID: 642285829 
 * Name: Kanda Saikaew
 * Section: 1
 * 
 */
package coe.java.demos.c6;

import java.awt.*;
import javax.swing.*;
public class JTextFieldDemo2 {
	public static void addComponents(Container cp) {
		cp.setLayout(new GridLayout(2,1));
		JPanel firstname = new JPanel();
		JLabel fname = new JLabel("Firstname:");
		JTextField fnameInput = 
			new JTextField(15);
		firstname.add(fname);
		firstname.add(fnameInput);
		JPanel lastname = new JPanel();
		JLabel lname = new JLabel("Lastname:");
		JTextField lnameInput = 
			new JTextField(15);
		lastname.add(lname);
		lastname.add(lnameInput);
		cp.add(firstname);
		cp.add(lastname);
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
				BorderLayout.AFTER_LAST_LINE);
		// Display the window.
		frame.pack();
		frame.setLocation(100, 100);
		frame.setVisible(true);
	}
}
