package coe.java.demos.c6;

import java.awt.*;
import javax.swing.*;
public class JComboBoxDemo {
	public static void addComponents(Container cp) {
		cp.setLayout(new GridLayout(2,1));
		JLabel label = new JLabel("Which color that you like?");
		cp.add(label);
		JComboBox colorChoice = new JComboBox();
		colorChoice.addItem("Red");
		colorChoice.addItem("Blue");
		colorChoice.addItem("Green");
		colorChoice.addItem("Black");
		colorChoice.setEditable(true);
		cp.add(colorChoice);
	}
	public static void main(String[] args) {
		JFrame frame = new JFrame("JComboBoxDemo");
		addComponents(frame.getContentPane());
		frame.pack();
		frame.setLocation(100, 100);
		frame.setVisible(true);
	}
}
