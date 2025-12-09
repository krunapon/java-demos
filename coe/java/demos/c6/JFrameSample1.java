package coe.java.demos.c6;

import javax.swing.*;

public class JFrameSample1 {
	public static void main(String[] args) {
		JFrame window = new JFrame("GUI Test");
		// default layout is FlowLayout
		JPanel panel = new JPanel();
		JButton submit = new JButton("Submit");
		JButton cancel = new JButton("Cancel");
		panel.add(submit);
		panel.add(cancel);
		window.add(panel);
		window.pack();
		window.setLocation(200,400);
		window.setVisible(true);
	}
}
