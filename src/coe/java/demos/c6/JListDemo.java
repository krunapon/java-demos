package coe.java.demos.c6;

import java.awt.*;
import javax.swing.*;
public class JListDemo {
	public static void addComponents(Container cp) {
		cp.setLayout(new BorderLayout());
		String labels[] = { "Zero", "One", "Two", "Three", 
				"Four", "Five", "Six",
			      "Seven", "Eight", "Nine", "Ten", "Eleven" };
		JList jlist = new JList(labels);
		JScrollPane scrollPane1 = new JScrollPane(jlist);
		cp.add(scrollPane1, BorderLayout.NORTH);
		cp.add(new JButton("Print"), BorderLayout.SOUTH);
	}
	public static void main(String[] args) {
		JFrame frame = new JFrame("JListDemo");
		addComponents(frame.getContentPane());
		frame.pack();
		frame.setLocation(100, 100);
		frame.setVisible(true);
	}
}
