package coe.java.demos.c6;

import java.awt.*;
import javax.swing.*;
public class JCheckBoxDemo {
	public static void addComponents(Container cp) {
		cp.setLayout(new GridLayout(2,1));
		JLabel label = new JLabel("Languages that you know well");
		JPanel boxes = new JPanel();
		boxes.setLayout(new FlowLayout());
		JCheckBox cPlusPlus = new JCheckBox("C++", true);
		JCheckBox php = new JCheckBox("PHP");
		JCheckBox java = new JCheckBox("Java", true);
		JCheckBox javascript = new JCheckBox("JavaScript");
		boxes.add(cPlusPlus);
		boxes.add(php);
		boxes.add(java);
		boxes.add(javascript);
		cp.add(label);
		cp.add(boxes);
	}
	public static void main(String[] args) {
		JFrame frame = new JFrame("JCheckBoxDemo");
		addComponents(frame.getContentPane());
		frame.pack();
		frame.setLocation(100, 100);
		frame.setVisible(true);
	}
}
