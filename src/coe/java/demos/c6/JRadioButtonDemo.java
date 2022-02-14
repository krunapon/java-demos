package coe.java.demos.c6;

import java.awt.*;

import javax.swing.*;
public class JRadioButtonDemo {
	public static void addComponents(Container cp) {
		cp.setLayout(new GridLayout(2,1));
		JLabel label = new JLabel("A grade that a student who works hard will get");
		JPanel grades = new JPanel();
		ButtonGroup choices = new ButtonGroup();
		JRadioButton a = new JRadioButton("A", true);
		JRadioButton b = new JRadioButton("B");
		JRadioButton c = new JRadioButton("C");
		JRadioButton d = new JRadioButton("D");
		choices.add(a);
		choices.add(b);
		choices.add(c);
		choices.add(d);
		grades.add(a);
		grades.add(b);
		grades.add(c);
		grades.add(d);
		cp.add(label);
		cp.add(grades);
	}
	public static void main(String[] args) {
		JFrame frame = new JFrame("JRadioButtonDemo");
		addComponents(frame.getContentPane());
		frame.pack();
		frame.setLocation(100, 100);
		frame.setVisible(true);
	}
}
